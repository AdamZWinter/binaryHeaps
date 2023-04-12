package driver;

import heap.BinaryHeap;

public class Main {
    public static void main(String[] args) {

        BinaryHeap<String> heapOfLetters = new BinaryHeap<>();
        String[] inputs = {"b", "p", "z", "h", "e", "a", "o", "w", "o", "r", "l", "d"};

        for (String input: inputs){
            heapOfLetters.add(input);
        }

        System.out.println(heapOfLetters);

        for (String input: inputs){
            System.out.print(heapOfLetters.remove());
        }

        System.out.println(System.lineSeparator());
        System.out.println(heapOfLetters);

    }
}