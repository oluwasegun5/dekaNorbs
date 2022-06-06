package array.listPackage;

public class ArrayList<I extends Number> {
    private int size;
    private int expandedLength = 2;
    private final int initialLength = 5;
    private String[] items = new String[initialLength];

    public int size() {
        return size;
    }

    public void add(String item) {
        if(size == (initialLength * (expandedLength -1)))expand();
        items[size] = item;
        size++;
    }
    public void add(int index, String item) {
        if(size == (initialLength * (expandedLength -1)))expand();

        if(index < size()) shiftAllAfter(index);
        items[index] = item;
        size++;
    }

    public String get(int index) {
        return items[index];
    }

    public void remove(int index) {
        if(index <= size){
            for (int i = index; i < items.length-1; i++) {
                String frontItem = items[i+1];
                items[i] = items[i+1];
                items[i+1] = frontItem;
            }
            size--;
        }
        else{
            throw new IllegalArgumentException("wetin nah");
        }
    }

    public void remove(String item) {
        for (int i = 0; i < size(); i++) {
            if (items[i].equals(item)){
                String frontItem = items[i+1];
                items[i] = items[i+1];
                items[i+1] = frontItem;
            }
        }
        size--;

    }

    private void expand(){
        String[] temp = new String[initialLength * expandedLength];
        System.arraycopy(items, 0, temp, 0, items.length);
        items = temp;
        expandedLength ++;
    }

    private void shiftAllAfter(int index) {
        int temp_index = 0;
        String tempValue = items[index + temp_index];

        for (int i = index; i < size() + 1; i++) {
            String secondPlaceHolder = items[i + 1];
            items[i + 1] = tempValue;
            tempValue = secondPlaceHolder;
            temp_index += 1;
        }
    }
}





//package abstraction;
//
//public class ArrayList implements List{
//    private String[] tempElement;
//    private int multiplyLengthBy = 1;
//    private final int initialLength = 10 * (multiplyLengthBy + ((size()/10)+1));
//
//    private int counter;
//    String[] elements;
//    public ArrayList(){
//        elements = new String[10];
//    }
//
//    @Override
//    public void add(String item) {
//
//        elements[counter] = item;
//        counter++;
//    }
//
//    @Override
//    public void add(int index, String item) {
//        if(size() == 10) increaseArrayLength();
//
//        if(index < size()) shiftAllAfter(index);
//        elements[index] = item;
//        counter++;
//    }
//
//    @Override
//    public String contains(int index) {
//        return elements[index];
//    }
//
//    @Override
//    public int size() {
//        return counter;
//    }
//
//    @Override
//    public void remove(int index) {
//        if(index == 0){
//            if (size() >= 0) System.arraycopy(elements, 1, elements, 0, size());
//            elements[size()-1] = elements[size()];
//        }
//        else if(index >0){
//            if (size() + 1 - index >= 0) System.arraycopy(elements, index + 1, elements, index, size() + 1 - index);
//            elements[size()-1] = elements[size()];
//        }
//    }
//
//    private void shiftAllAfter(int index){
//        int temp_index = 0;
//        String tempValue = elements[index + temp_index];
//
//        for (int i = index; i < size() +1; i++) {
//            String secondPlaceHolder = elements[i+1];
//            elements[i+1] = tempValue;
//            tempValue = secondPlaceHolder;
//            temp_index +=1;
//        }
//    }
//    private void copyFromElementToTempElement(){
//        tempElement = new String[multiplyLengthBy * initialLength];
//        for (int i = 0; i < size(); i++) {
//            tempElement[i] = elements[i];
//        }
//    }
//    private void copyFromTempElementToElement(){
//        tempElement = new String[multiplyLengthBy * initialLength];
//        for (int i = 0; i < size(); i++) {
//            elements[i] = tempElement[i];
//        }
//    }
//    private void increaseArrayLength(){
//        copyFromElementToTempElement();
//        copyFromTempElementToElement();
//        multiplyLengthBy ++;
//
//    }
//
//}
