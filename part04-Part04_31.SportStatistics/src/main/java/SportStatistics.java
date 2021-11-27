
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int games = 0;
        int wins = 0;
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        try(Scanner scanner = new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                String winner = "";
                int result1 = Integer.valueOf(parts[2]);
                int result2 = Integer.valueOf(parts[3]);
                if (team1.equals(team) || team2.equals(team)) {
                    games++;
                if (result1 > result2 ) {
                     winner = team1;
                } else {
                    winner = team2;
                }
                if (winner.equals(team)) {
                    wins++;
                }
            }
            
        }
        }catch(Exception error){
            System.out.println("Error " + error.getMessage());
        }
        System.out.println("Games: "+games);
        System.out.println("Wins: "+wins);
        System.out.println("Losses: "+(games - wins));

    }

}
