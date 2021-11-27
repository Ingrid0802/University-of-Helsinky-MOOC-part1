import java.util.Scanner;
public class InAHoleInTheGround {

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int value = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < value; i++){
            printText();
        }
    }
}
    
    

