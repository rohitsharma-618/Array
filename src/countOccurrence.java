import java.util.Scanner;

public class countOccurrence {
    static int countNum (int[]array ,int x) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                count++;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter size of array :- ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter " + n + " elements :- ");
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter x :- ");
        int x = sc.nextInt();

        System.out.println("Count of array :- " +countNum(array, x));
    }
}
