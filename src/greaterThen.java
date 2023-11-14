import java.util.Scanner;

public class greaterThen {                                           // error
    static int greaterNum(int []array, int x ){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        for (int i = 0; i <  array.length;i++){
            if (array[i] > x){
                num ++;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" Enter size :- ");
        int n  = sc.nextInt();

        int[]array = new int[n];
        System.out.println("Enter " + n + " elements of the array :- ");
        for (int i = 0; i < array.length ;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter x:- ");
        int x = sc.nextInt();

        System.out.println("Strictly greater then x :- " +greaterNum(array, x));
    }

}
