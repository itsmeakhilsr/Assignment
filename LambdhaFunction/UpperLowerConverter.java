//3. Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
package LambdhaFunction;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class UpperLowerConverter {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");

        List<String> uppercaseStrings = convertList(strings, str -> str.toUpperCase());

        List<String> lowercaseStrings = convertList(strings, str -> str.toLowerCase());

        System.out.println("Original list: " + strings);
        System.out.println("Uppercase list: " + uppercaseStrings);
        System.out.println("Lowercase list: " + lowercaseStrings);
    }

    public static List<String> convertList(List<String> list, Function<String, String> converter) {
        List<String> convertedList = new ArrayList<>();
        for (String str : list) {
            convertedList.add(converter.apply(str));
        }
        return convertedList;
    }
}
