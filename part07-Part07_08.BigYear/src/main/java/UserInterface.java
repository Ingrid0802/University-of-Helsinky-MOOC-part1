/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid
 */
import java.util.Scanner;

public class UserInterface {
    
        private BirdList birdList;
    private Scanner scanner;

    public UserInterface(BirdList birdList, Scanner scanner){
        this.birdList = birdList;
        this.scanner = scanner;
    }

    public void start(){

        while (true){
            System.out.println("?");
            String command = scanner.nextLine();
            if(command.equalsIgnoreCase("quit")){
                break;
            } else if(command.equalsIgnoreCase("add")){
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scanner.nextLine();
                birdList.add(name,latinName);
            } else if(command.equalsIgnoreCase("observation")){
                System.out.println("Bird?");
                String birdName = scanner.nextLine();
                birdList.addObservation(birdName);
            } else if(command.equalsIgnoreCase("all")){
                birdList.printAll();
            } else if(command.equalsIgnoreCase("one")){
                System.out.println("Bird?");
                String name = scanner.nextLine();
                birdList.printOneBird(name);
            }
        }
    }
}
