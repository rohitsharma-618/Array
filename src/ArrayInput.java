import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("ENTER ARRAY LENGTH = ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("ENTER AN ARRAY :- ");
        for (int i = 0;i < n ;i++){
            array[i] = sc.nextInt();
        }
        for (int i =0 ; i < array.length;i++ ){
            System.out.print(array[i] + " ");
        }

    }
}
