import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books>bookValues = new ArrayList<>();
        while(true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int pages = scanner.nextInt();
            System.out.println("Publication year: ");
            int publicationYear = scanner.nextInt();
            scanner.nextLine();
            bookValues.add(new Books(title, pages, publicationYear));
        }

        System.out.println("What information will be printed?");
        String info = scanner.nextLine();
        for(int i = 0; i < bookValues.size(); i++){
            if(info.equals("name")){
                System.out.println(bookValues.get(i).getTitle());
            } else if(info.equals("everything")){
                System.out.println(bookValues.get(i));
            }
        }

    }
}
