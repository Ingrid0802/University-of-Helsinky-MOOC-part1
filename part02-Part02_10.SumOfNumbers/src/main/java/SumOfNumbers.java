
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Give a number:");
            int value = scanner.nextInt();
            scanner.nextLine();
            if(value == 0){
                break;
            }else{
                sum += value;
            }
        }
        System.out.println("Sum of the numbers: " + sum);

    }
}
