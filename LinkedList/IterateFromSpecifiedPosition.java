package LinkedList;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateFromSpecifiedPosition {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");
        linkedList.add("Mango");

        int startPosition = 2;
        System.out.println("Iterating through LinkedList starting from position " + startPosition + ":");
        ListIterator<String> iterator = linkedList.listIterator(startPosition);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
