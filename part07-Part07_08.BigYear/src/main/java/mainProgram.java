
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdList birdList = new BirdList();
        UserInterface ui = new UserInterface(birdList, scanner);
        ui.start();

    }

}
