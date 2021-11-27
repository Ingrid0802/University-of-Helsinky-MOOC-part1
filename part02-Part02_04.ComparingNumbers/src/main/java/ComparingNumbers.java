
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        scanner.nextLine();
        int secondNumber = scanner.nextInt();
        scanner.nextLine();
        if(firstNumber > secondNumber){
            System.out.println(firstNumber + " is greater than " + secondNumber);
        }else if(firstNumber < secondNumber){
            System.out.println(secondNumber + " is smaller than " + firstNumber);
        }else {
            System.out.println(firstNumber + " is equal to " + secondNumber);
        }

    }
}
