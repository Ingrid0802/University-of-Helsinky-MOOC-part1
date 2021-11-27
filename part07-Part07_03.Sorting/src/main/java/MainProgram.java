
import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);

    }

    public static int smallest(int [] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int indexOfSmallest(int[] array){
        if(array.length == 0){
            return -1;
        }

        int index = 0;
        int min = array[index];

        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static  int indexOfSmallestFrom(int [] table, int startIndex){

        if(table.length == 0){
            return -1;
        }

        int index = startIndex;
        int min = table[index];
        for(int i = startIndex; i < table.length; i++){
            if(table[i] < min){
                min = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int [] array, int index1, int index2){

        int temp = array[index1];

     //   for (int i = 0; i < array.length; i++){
            if(index1 <= array.length-1 && index2 <= array.length-1){
                temp = array[index1];
                array[index1] = array[index2];
                array[index2] = temp;
            }
       // }
    }

    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
}


