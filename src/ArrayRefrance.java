import java.util.Arrays;
import java.util.Scanner;

public class  ArrayRefrance {
    static void PrintArray (int [] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] +" " );
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int[] array = new int[4];
        array[0] = 5 ;
        array[1] = 6;
        array[2] = 2;
        array[3] = 9;


        System.out.println("ORIGINAL array = ");
        PrintArray(array);

        //trying to copy array to array_2
//        int [] array_2 = array;

        //CLONING AN ARRAY                            // *** Deep Copy ***
//        int [] array_2 = array.clone();

        // Copy METHOD & Copy OF RANGE
//        int[] array_2 = Arrays.copyOf(array , array.length);
        int [] array_2 = Arrays.copyOfRange(array, 1, array.length);

        System.out.println("COPIED array_2 = ");
        PrintArray(array_2);


        // CHANGING SOME VALUES OF  array_2
        array_2[0] = 0;
        array_2[1] = 1;

        System.out.println("ORIGINAL array AFTER CHANGING VALUE OF array_2 = " );
        PrintArray(array);
        System.out.println("COPIED array_2 AFTER CHANGING VALUE OF array_2 = ");
        PrintArray(array_2);

        }

    }

