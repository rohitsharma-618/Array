import java.util.Arrays;
import java.util.Scanner;

public class shortedArray{
    static int[] array(int[]array){
        Arrays.sort(array);
        int [] Answer = { array [1], array[3]};
        return Answer;
        }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :- ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter " + n + " elements :- ");
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        int[] Answer =array(array);
        System.out.println("Smallest :- " + Answer[0]);
        System.out.println("largest :- " + Answer[1]);
    }
}
