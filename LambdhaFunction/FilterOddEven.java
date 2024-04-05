//4. Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
package LambdhaFunction;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterOddEven {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> evenNumbers = filterList(numbers, num -> num % 2 == 0);

        List<Integer> oddNumbers = filterList(numbers, num -> num % 2 != 0);

        System.out.println("Original list: " + numbers);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
    public static List<Integer> filterList(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> filteredList = new ArrayList<>();
        for (Integer num : list) {
            if (predicate.test(num)) {
                filteredList.add(num);
            }
        }
        return filteredList;
    }
}

