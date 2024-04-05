//6. Write a Java program to remove the third element from an array list.
import java.util.ArrayList;

public class RemoveThirdElement {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        list.add("Mango");

        System.out.println("Original List:");
        System.out.println(list);

        int indexToRemove = 2; 
        if (indexToRemove >= 0 && indexToRemove < list.size()) {
            list.remove(indexToRemove);
            System.out.println("List after removing the third element:");
            System.out.println(list);
        } else {
            System.out.println("Invalid index provided.");
        }
    }
}
