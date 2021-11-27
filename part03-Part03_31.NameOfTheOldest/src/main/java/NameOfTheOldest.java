
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        String name = "";
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] values = input.split(",");
            int age = Integer.valueOf(values[1]);
            if(max < age){
                name = values[0];
                max = age;
            }
        }
        System.out.println("Name of the oldest: " + name);


    }
}
