package task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Integer[] arr = {6,7,8};
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        Change.put(arr,arrayList);


        String[] arrStr = new String[100];
        ArrayList<String> arrayListStr = new ArrayList<>();
        arrayListStr.add("tt");
        arrayListStr.add("gg");
        arrayListStr.add("ff");

        Change.put(arrStr,arrayListStr);


    }
}
