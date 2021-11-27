
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true){
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            count += 1;
            if(number == 0){
                count -= 1;
                break;

            }
        }
        System.out.println("Number of numbers: " + count);

    }
}
