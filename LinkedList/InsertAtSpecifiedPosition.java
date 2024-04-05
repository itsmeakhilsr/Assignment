//5. Write a Java program to insert the specified element at the specified position in the linked list.
package LinkedList;
import java.util.LinkedList;

public class InsertAtSpecifiedPosition {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");
        linkedList.add("Mango");

        System.out.println("Original LinkedList:");
        System.out.println(linkedList);

        String elementToInsert = "Pineapple";

        int position = 2;

        linkedList.add(position, elementToInsert);

        System.out.println("\nLinkedList after inserting element \"" + elementToInsert + "\" at position " + position + ":");
        System.out.println(linkedList);
    }
}
