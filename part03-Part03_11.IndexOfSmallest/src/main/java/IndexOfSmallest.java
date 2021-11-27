
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
         ArrayList<Integer> values = new ArrayList<>();
        while (true) {
            int value = scanner.nextInt();
            scanner.nextLine();
            if (value == 9999) {
                break;
            }
            values.add(value);
        }

        int min = values.get(0);

        for (int i = 0; i < values.size(); i++) {
            int number = values.get(i);
            if (number < min) {
                min = number;

            }
        }
        System.out.println("Smallest number: " + min);

        for(int i = 0; i < values.size(); i++){
            if(values.get(i) == min){
                System.out.println("Found at index: " + i);
            }

        }
        
    }
}
