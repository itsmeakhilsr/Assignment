//7. Write a Java program to search for an element in an array list.
import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        list.add("Mango");

        String searchElement = "Orange";

        boolean found = list.contains(searchElement);

        if (found) {
            System.out.println("The element \"" + searchElement + "\" is found in the ArrayList.");
        } else {
            System.out.println("The element \"" + searchElement + "\" is not found in the ArrayList.");
        }
    }
}
