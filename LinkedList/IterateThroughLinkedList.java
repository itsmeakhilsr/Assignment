//2. Write a Java program to iterate through all elements in a linked list.
package LinkedList;
import java.util.LinkedList;

public class IterateThroughLinkedList {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");

        System.out.println("\nIterating through LinkedList using for-each loop:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
