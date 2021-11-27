
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer>values = new ArrayList<>();
        while(true){
            int value = scanner.nextInt();
            scanner.nextLine();
            if(value == -1){
                break;
            }
            values.add(value);
        }
        double average = 0;
        int sum  = 0;
        for(int i = 0; i < values.size(); i++){
            int number = values.get(i);
            sum += number;
            average = (double) sum / values.size();
        }
        System.out.println("Average: " + average);
        
    }
}
