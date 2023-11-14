class ques {
    void que_1() {
        int[] array = {1, 15, 5, 9};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            sum = sum + array[i];
        }

        System.out.println();
        System.out.println("sum = " + sum);
    }

    void que_2() {
        int[] array = {1, 8, 6};
        int ans = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > ans) {
                ans = array[i];
            }
        }
        System.out.println();
        System.out.println("---a--- ans-2 --- ");
        System.out.println("Larger number the Given array = " + ans);
    }

    void que_3() {
        
        // LINEAR SEARCH

        int[] array = {1, 5, 8, 9, 10, 15, 4, 6};
        int X = 6;
        int ans = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                ans = i;
            }
        }
        System.out.println();
        System.out.println("---b--- ans-3 ---");
        if(ans == -1){
            System.out.println("NOT FOUND !!!");
        }else {

            System.out.println("found " + X +  " at index " +ans);
        }
    }
}

    public class Questions {
        public static void main(String[] args) {
            ques object = new ques();
            object.que_1();
            object.que_2();
            object.que_3();

    }
}

