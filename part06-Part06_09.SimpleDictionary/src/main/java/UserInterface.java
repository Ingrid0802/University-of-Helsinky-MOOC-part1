
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid
 */
class UserInterface {
    
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }

    public void start(){
        while (true){
            System.out.println("Commnad:");
            String command = scanner.nextLine();
            if(command.equalsIgnoreCase("stop")){
                break;
            }
            processCommand(command);
        }
    }


    public void add(){
        System.out.println("To add: ");
        String addCommand = scanner.nextLine();
        list.add(addCommand);
    }

    public void list(){
        list.print();
    }

    public void remove(){
        System.out.println("Which one is removed?");
        int id = scanner.nextInt();
        scanner.nextLine();
        list.remove(id);
    }

    public void processCommand(String command) {
        if (command.equalsIgnoreCase("add")) {
            add();
        } else if (command.equalsIgnoreCase("list")) {
            list();
        } else if (command.equalsIgnoreCase("remove")) {
            remove();
        }
    }
}
