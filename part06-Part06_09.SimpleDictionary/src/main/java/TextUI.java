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
public class TextUI {
    
    private SimpleDictionary dictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.dictionary = dictionary;
        this.scanner = scanner;
    }

    public void start(){

        while (true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;

            } else if(command.equals("add")){
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                dictionary.add(word,translation);
            } else if(command.equals("search")){
                System.out.println("To be translated:");
                String wordTranslate = scanner.nextLine();
                String translationOfWord = dictionary.translate(wordTranslate);
                if(translationOfWord == null){
                    System.out.println("Word " + wordTranslate + " was not found");
                } else{
                    System.out.println("Translation: " + dictionary.translate(wordTranslate));
                }
            }
            System.out.println("Unknown command");
        }
    }
}
