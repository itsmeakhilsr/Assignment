package LinkedList;

import java.util.LinkedList;

public class AppendToEndOfLinkedList {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");

        System.out.println("Original LinkedList:");
        System.out.println(linkedList);

        String elementToAppend = "Mango";
        linkedList.addLast(elementToAppend);

        System.out.println("LinkedList after appending the element:");
        System.out.println(linkedList);
    }
}
