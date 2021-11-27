
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for? ");
        String nameToSearch = scanner.nextLine();
        for(int i = 0; i < list.size(); i++){
            String name = list.get(i);
            if(nameToSearch.equals(name)){
                System.out.println(nameToSearch + " was found!");
                break;
            }
            if(!nameToSearch.equals(name) && i ==(list.size()-1)){
                System.out.println(nameToSearch + " was not found!");
                break;
                
            }
        }
    }
}
