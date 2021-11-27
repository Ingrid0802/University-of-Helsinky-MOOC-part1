
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            else{
                String[] text = input.split(" ");
                for(int i = 0; i < text.length; i++){
                    if(text[i].contains("av")){
                        System.out.println(text[i]);
                    }
                }
            }
        }


    }
}
