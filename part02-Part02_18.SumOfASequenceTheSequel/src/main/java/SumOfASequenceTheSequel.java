
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number?");
        int firstNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Last number?");
        int lastNumber = scanner.nextInt();
        scanner.nextLine();
        while(lastNumber >= firstNumber){
            sum += firstNumber;
            firstNumber++;
        }
        System.out.println("The sum is " + sum);

    }
}
