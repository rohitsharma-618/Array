import java.util.Scanner;

public class lastOccurrence {
    static int lastNum(int [] array, int x){
        Scanner sc = new Scanner(System.in);
       int  lastIndex = -1;
        for (int i = 0;i< array.length;i++){
            if (array[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:- ");
        int n = sc.nextInt();

        int [] array = new int[n];
        System.out.println("Enter " + n + " Element:-" );
        for (int i = 0; i < array.length;i++) {
            array[i] = sc.nextInt();
        }
            System.out.println("Enter x:- ");
            int x = sc.nextInt();

            System.out.println("count of array:- " +lastNum(array, x));

    }
}
