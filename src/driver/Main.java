package driver;

import heap.MinHeap;

public class Main {
    public static void main(String[] args) {

        MinHeap<String> heapOfLetters = new MinHeap<>();
        String[] inputs = {"b", "p", "z", "h", "e", "a", "o", "w", "o", "r", "l", "d"};

        for (String input: inputs){
            heapOfLetters.add(input);
        }

        System.out.println(heapOfLetters);


    }
}