import java.util.ArrayList;

public class InsertFirstPosition {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");

        list.add(0, "Apple");

        System.out.println("ArrayList after inserting element at the first position:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}
