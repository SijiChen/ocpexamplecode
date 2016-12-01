package ch03.arrayandarraylist;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sjchen on 12/1/16.
 */
public class ArrayAndArrayListExample {
    public static void main(String[] args) {
        //init an array
        String[] array = {"elem1", "elem2"};
        //use util class Arrays.toList to get a list, this list back with the same array and modification will be reflect on both
        List<String> list = Arrays.asList(array);
        System.out.println("the list from array:" + list);
        System.out.println("the array is:" + Arrays.toString(array));

        list.set(1, "modified2");
        System.out.println("the list from array after mod is: " + list);
        System.out.println("the array after list mod is: " + Arrays.toString(array));

        array[0] = "modified1";
        System.out.println("the array after array mod: " + Arrays.toString(array));
        System.out.println("the list after array mod: " + list);

        //this method shouldn't be supported
        try {
            list.remove(1);
        } catch (UnsupportedOperationException e) {
            System.out.println("remove method is not supported because the list is backed by an array");
        }

        String[] arrayback = (String[]) list.toArray();

    }
}
