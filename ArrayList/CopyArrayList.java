//9. Write a Java program to copy one array list into another.
import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args) {

        ArrayList<String> sourceList = new ArrayList<>();
        sourceList.add("Apple");
        sourceList.add("Banana");
        sourceList.add("Orange");
        sourceList.add("Grapes");
        sourceList.add("Mango");

        ArrayList<String> destinationList1 = new ArrayList<>();
        destinationList1.addAll(sourceList);

        ArrayList<String> destinationList2 = new ArrayList<>(sourceList);

        System.out.println("Copied ArrayList using addAll():");
        System.out.println(destinationList1);

        System.out.println("Copied ArrayList using copy constructor:");
        System.out.println(destinationList2);
    }
}
