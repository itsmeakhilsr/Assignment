//1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
import java.util.ArrayList;

public class ColorArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Colors:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
