
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeStats gradeStats = new GradeStats();
        UserInterface ui = new UserInterface(scanner,gradeStats);
        ui.start();
    }
}
