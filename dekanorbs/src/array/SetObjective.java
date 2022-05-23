package array;

import java.util.ArrayList;

public class SetObjective {
    public static void main(String[] args) {
        int[] set1 = {12,13,6,10};
        int[] set2 = {13,10,16,15};
        sort(convert(set1),convert(set2));

    }
    private static ArrayList<Integer> convert(int[] num){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < num.length; i++) {
            list.add(i);
        }
        return list;

    }
    public static void sort(ArrayList<Integer> first, ArrayList<Integer> second) {

        ArrayList<Integer> overlapping = new ArrayList<Integer>();
        ArrayList<Integer> common = new ArrayList<Integer>();


        for (int i = 0; i < first.size(); i++) {
            for (int j = 0; j < second.size(); j++) {
                if (second.contains(first.get(i))) {
                    System.out.println(first.get(i));
                    second.remove(first.get(i));
                    first.remove(i);
                }

            }
        }
        System.out.println(common);

    }
}
