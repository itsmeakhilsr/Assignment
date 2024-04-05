import java.util.ArrayList;

public class UpdateArrayElement {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        list.add("Mango");

        System.out.println("Original List:");
        System.out.println(list);

        int index = 2;

        String newElement = "Strawberry";

        if (index >= 0 && index < list.size()) {
            list.set(index, newElement);
            System.out.println("Updated List:");
            System.out.println(list);
        } else {
            System.out.println("Index out of bounds.");
        }
    }
}
