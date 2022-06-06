package array.listPackage;



public class HashMap {
    private ArrayList keys = new ArrayList();
    private ArrayList values = new ArrayList();

    public void put(String key, String value) {
        if(!contains(key)) {
            keys.add(key);
            values.add(value);
        }
        else{
            for (int i = 0; i < keys.size(); i++) {
                if (keys.get(i).equals(key)) values.add(i,value);
            }
        }
    }

    public int size() {
        return keys.size();
    }

    public boolean isEmpty() {
        return keys.size() == 0;
    }

    public String get(String key) {
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i).equals(key)) return values.get(i);
        }
        return null;
    }

    public boolean contains(String key) {
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i).equals(key)) return true;
        }
        return false;
    }
}
