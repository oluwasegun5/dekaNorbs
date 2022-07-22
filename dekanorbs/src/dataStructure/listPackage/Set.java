package dataStructure.listPackage;

public class Set {
    ArrayList<Number> set = new ArrayList<Number>();

    public void add(String item) {
        if(!contains(item))set.add(item);
    }

    public int size() {
        return set.size();
    }

    public boolean contains(String item) {
        for (int i = 0; i < size(); i++) {
            if(set.get(i).equals(item)) return true;
        }
        return false;
    }

    public void remove(String item) {
        set.remove(item);
    }
}
