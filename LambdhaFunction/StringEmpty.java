//2. Write a Java program to implement a lambda expression to check if a given string is empty.
package LambdhaFunction;
public class StringEmpty {
    public static void main(String[] args) {
        StringChecker stringChecker = str -> str.isEmpty();

        String str1 = "";
        String str2 = "Hello";

        boolean isEmpty1 = stringChecker.check(str1);
        boolean isEmpty2 = stringChecker.check(str2);

        System.out.println("Is \"" + str1 + "\" empty? " + isEmpty1);
        System.out.println("Is \"" + str2 + "\" empty? " + isEmpty2);
    }

    interface StringChecker {
        boolean check(String str);
    }
}
