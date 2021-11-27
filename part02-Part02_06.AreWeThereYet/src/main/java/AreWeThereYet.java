
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Give a number:");
            int value = scanner.nextInt();
            scanner.nextLine();
            if(value == 4){
                break;
            }
            System.out.println("you wrote " + value);
        }

    }
}
