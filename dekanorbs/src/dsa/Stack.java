package dsa;

public class Stack {
    private int numberOfElement;
    private int[] elements = new int[5];;

    public boolean isEmpty() {
        return numberOfElement == 0;
    }

    public void push(int element) {
        elements[numberOfElement] = element;
        numberOfElement++;

    }

    public int pop() {
        numberOfElement--;
        return elements[numberOfElement];
    }

    public int peek() {
        return elements[numberOfElement-1];
    }
}
