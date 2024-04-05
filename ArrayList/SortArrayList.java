//8. Write a Java program to sort a given array list.
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(4);

        System.out.println("Original List:");
        System.out.println(list);

        Collections.sort(list);

        System.out.println("Sorted List:");
        System.out.println(list);
    }
}
