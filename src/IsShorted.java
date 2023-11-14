import javax.swing.*;
import java.util.Scanner;

public class IsShorted {
    static boolean shorted(int[]array){
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        for (int i =  1 ; i < array.length;i++){

            if (array[i] < array[i-1] ){
                check = false;
                break;}
        }

    return check;}

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" Enter size :- ");
        int n  = sc.nextInt();

        int[]array = new int[n];
        System.out.println("Enter " + n + " elements of the array :- ");
        for (int i = 0; i < array.length ;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("check :- " +shorted(array));
    }
}
