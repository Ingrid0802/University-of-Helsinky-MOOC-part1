
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        try(Scanner scan = new Scanner(Paths.get(file))){
            while (scan.hasNextLine()){
                String row = scan.nextLine();
                String[] values = row.split(",");
                String name = values[0];
                int age = Integer.valueOf(values[1]);
               
                System.out.println(name + ", age: " + age + " years");
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
