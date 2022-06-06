package array.listPackage;

public class Queue {
    String[] items;
    private int size;
    public Queue(int length){
        items = new String[length];
    }

    public boolean add(String item) {
        items[size] = item;
        size++;
        return true;
    }

    public String peek() {
        return items[0];
    }

    public String remove() {
        String item = items[0];
        for (int i = 0; i < items.length-1; i++) {
            items[i] = items[i + 1];
        }
        return item;
    }
}
