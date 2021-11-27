
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberOfNumbers = 0;
        while(true){
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            if(number == 0){
                break;
            }else{
                numberOfNumbers += 1;
                sum += number;
                
            }
        }
        System.out.println("Number of numbers: " + numberOfNumbers);
        System.out.println("Sum of the numbers: " + sum);

    }
}
