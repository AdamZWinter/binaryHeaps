package heap;

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
        return null;
    }

}
