
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        int sum = firstNumber + secondNumber;
        int substract = firstNumber - secondNumber;
        int multiply = firstNumber * secondNumber;
        double division = firstNumber / (double) secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + substract);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiply);
        System.out.println(firstNumber + " / " + secondNumber + " = " + division);

    }
}
