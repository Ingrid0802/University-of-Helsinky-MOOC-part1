
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
          try(Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                String row = scan.nextLine();
                int value = Integer.valueOf(row);
                if(value >= lowerBound && value <= upperBound){
                    count++;
                  //  System.out.println(count);
                }
            }
            System.out.println("Numbers: " + count);
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }

}
