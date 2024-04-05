//5. Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
package LambdhaFunction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortInAlphabetic {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Orange");
        strings.add("Banana");
        strings.add("Grapes");

        Collections.sort(strings, (str1, str2) -> str1.compareTo(str2));

        System.out.println("Sorted list: " + strings);
    }
}

