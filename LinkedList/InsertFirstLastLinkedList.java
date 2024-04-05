//6. Write a Java program to insert elements into the linked list at the first and last positions/
package LinkedList;
import java.util.LinkedList;

public class InsertFirstLastLinkedList {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");

        System.out.println("Original LinkedList:");
        System.out.println(linkedList);

        String elementFirst = "Apple";

        linkedList.addFirst(elementFirst);

        System.out.println("\nLinkedList after inserting \"" + elementFirst + "\" at the first position:");
        System.out.println(linkedList);

        String elementLast = "Mango";

        linkedList.addLast(elementLast);

        System.out.println("\nLinkedList after inserting \"" + elementLast + "\" at the last position:");
        System.out.println(linkedList);
    }
}
