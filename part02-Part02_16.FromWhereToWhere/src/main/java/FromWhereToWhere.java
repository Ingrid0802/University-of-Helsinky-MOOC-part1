
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Where to?");
        int end = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Where from?");
        int start = scanner.nextInt();
        scanner.nextLine();
        while(end >= start){
            System.out.println(start);
            start++;
        }
    }
}
