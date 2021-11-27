

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
      System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());
        for(int i = 0; i < array.length; i++){
            if(searching == array[i]){
                System.out.println(searching + " is at index " + i +".");
                break;
            }else if(searching != array[i] && i == (array.length - 1)){
                System.out.println(searching + " was not found.");
                break;
            }
        }    array[6] = 9;
        array[7] = 7;

      

        // Implement the search functionality here
    }

}
