
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while (true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] values = input.split(",");

            if(max < Integer.valueOf(values[1])){
                max = Integer.valueOf(values[1]);
            }
        }
        System.out.println("Age of the oldest: " + max);

    }
}
