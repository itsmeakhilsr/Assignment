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
