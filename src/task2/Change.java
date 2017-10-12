package task2;


import java.util.ArrayList;
import java.util.Arrays;

public class Change {

    public static <T> void put(T []array, ArrayList<T> collection){

        array = (T[])(new Object[collection.size()]);

        try {
            for (int i = 0; i < collection.size(); i++) {
                array[i] = collection.get(i);
            }

            System.out.println(Arrays.toString(array));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Sorry, but the collection size can not be longer than the length of the array");
        }

    }
}
