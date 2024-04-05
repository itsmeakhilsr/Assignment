//2. Write a Java program to iterate through all elements in an array list.
import java.util.ArrayList;

public class IterateArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        list.add("Mango");

        System.out.println("Elements in the ArrayList:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}
