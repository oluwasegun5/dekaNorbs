package array.listPackage;

public class Stack {
    private String[] items;
    private int size = 0;

    public Stack(int length){
        items = new String[length];
    }
    public void push(String item) {
        items[size] = item;
        size++;
    }

    public String pop() {
        String item = items[size-1];
        size--;
        return item;
    }

    public String peek() {
        return items[size-1];
    }

    public boolean empty() {
        return size == 0;
    }
}
