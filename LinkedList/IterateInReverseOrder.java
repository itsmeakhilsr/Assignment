//4. Write a Java program to iterate a linked list in reverse order.
package LinkedList;
import java.util.LinkedList;
import java.util.Iterator;

public class IterateInReverseOrder {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");
        linkedList.add("Mango");

        System.out.println("Iterating through LinkedList in reverse order:");
        Iterator<String> iterator = linkedList.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
