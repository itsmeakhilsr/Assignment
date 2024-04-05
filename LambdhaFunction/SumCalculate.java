//1. Write a Java program to implement a lambda expression to find the sum of two integers.
package LambdhaFunction;
public class SumCalculate {
    public static void main(String[] args) {
        SumCalculator sumCalculator = (a, b) -> a + b;

        int num1 = 10;
        int num2 = 20;
        int sum = sumCalculator.calculateSum(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    interface SumCalculator {
        int calculateSum(int a, int b);
    }
}

