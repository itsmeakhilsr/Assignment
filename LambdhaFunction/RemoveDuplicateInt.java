//7. Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
package LambdhaFunction;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateInt {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(50);

        List<Integer> uniqueNumbers = numbers.stream()
                                            .distinct()
                                            .collect(Collectors.toList());

        System.out.println("List without duplicates: " + uniqueNumbers);
    }
}

