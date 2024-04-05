//4. Write a Java program to retrieve an element (at a specified index) from a given array list
import java.util.ArrayList;

public class RetrieveElementAtIndex {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        list.add("Mango");

        int index = 2;

        if (index >= 0 && index < list.size()) {
            String element = list.get(index);
            System.out.println("Element at index " + index + ": " + element);
        } else {
            System.out.println("Index out of bounds.");
        }
    }
}
