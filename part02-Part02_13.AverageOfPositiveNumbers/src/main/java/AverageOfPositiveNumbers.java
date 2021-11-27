
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double ave = 0;
        int amount = 0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num > 0){
                sum += num;
                amount++;
            }
            if(num == 0){
                break;
            }
        }
        if(sum <= 0){
            System.out.println("Cannot calculate the average");
        }else{
            ave = sum / amount;
            System.out.println(ave);
        }

    }
}
