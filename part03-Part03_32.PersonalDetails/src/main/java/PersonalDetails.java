
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        int sum = 0;
        double average = 0;
        String name = "";
        int maxNameLength = 0;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] values = input.split(",");
            sum += Integer.valueOf(values[1]);
            numbers++;
            average = (double) sum / numbers;

            if(maxNameLength < values[0].length()){
                name = values[0];
                maxNameLength = name.length();
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of birth years: " + average);


    }
}
