package heap;

import java.util.Arrays;

public class MinHeap<T extends Comparable<T>>
{
    private T[] heap;
    private int size;

    public MinHeap(){
        heap = (T[])new Comparable[20];
        size = 0;
    }

    public void add(T element){
        heap[size +1] = element;
        size++;

        swim(size);
    }

    private void swim(int currentIndex) {
        if(currentIndex == 0 || currentIndex == 1){
            //nothing
        }
        else if(heap[currentIndex].compareTo(heap[currentIndex / 2]) < 0){
            T temp = heap[currentIndex];
            heap[currentIndex] = heap[currentIndex / 2];
            heap[currentIndex / 2] = temp;
            swim(currentIndex / 2);
        }
    }

    public T remove(){
        if(size == 0){throw new IndexOutOfBoundsException("You cannot remove from an empty heap.");};
        T head = heap[1];
        heap[1] = heap[size];
        heap[size] = null;
        size--;
        sink(1);
        return head;
    }

    private void sink(int parentIndex) {
        int left = parentIndex * 2;
        int right = left + 1;
        if(left <= size && heap[parentIndex].compareTo(heap[left]) > 0){
            T temp = heap[parentIndex];
            heap[parentIndex] = heap[left];
            heap[left] = temp;
            sink(left);
        }
        if(right <= size && heap[parentIndex].compareTo(heap[right]) > 0){
            T temp = heap[parentIndex];
            heap[parentIndex] = heap[right];
            heap[right] = temp;
            sink(right);
        }
    }

    @Override
    public String toString() {
        return "BinaryHeap{" +
                "heap=" + Arrays.toString(heap) +
                '}';
    }
}
