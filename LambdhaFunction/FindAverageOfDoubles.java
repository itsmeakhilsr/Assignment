//6. Write a Java program to implement a lambda expression to find the average of a list of doubles.
package LambdhaFunction;
import java.util.ArrayList;
import java.util.List;

public class FindAverageOfDoubles {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(10.5);
        numbers.add(20.5);
        numbers.add(30.5);
        numbers.add(40.5);

        double average = numbers.stream()
                                .mapToDouble(Double::doubleValue)
                                .average()
                                .orElse(0);

        System.out.println("Average of the list: " + average);
    }
}


