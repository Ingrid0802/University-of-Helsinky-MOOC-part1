
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Name:");
            String item = scanner.nextLine();
            if(item.equals("")){
                break;
            }
            items.add(new Item(item));
        }

        for(int i = 0; i < items.size(); i++){
            System.out.println(items.get(i));
        }
    }
}
