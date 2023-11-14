class arrayDemo{

    void multiArray(){
//      int[][] num_1 = new int[4][3][5];
//        num_1 [0][0][0]= 5;

       // System.out.println(num_1[0][0][0]);
        int [][] arr = {{5,6,9},{7,9,5},{2,4,7}};

        System.out.println(arr[0][0]);  //5
        System.out.println(arr[0][1]);  //6

        System.out.println("---a---");

        System.out.println(arr[1][0]);  //7
        System.out.println(arr[1][1]);  //9

        System.out.println("---b---");

        System.out.println(arr[2][0]);  //2
        System.out.println(arr[2][1]);  //4

        System.out.println("---c--- for loop in multi array ---");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(arr[i][j]);
            }
        }

        System.out.println("---d---");



    }
     void array() {
         int[] num = new int[3];
         String[] FavName = new String[5];
         float[] weights = new float[4];

         num[0] = 12;
         num[1] = 45;
         num[2] = 15;

         FavName[0] = "Pikku";
         FavName[1] = "Rohit";

         System.out.println(num[0]);
         System.out.println(num[1]);
         System.out.println(num[2]);

         System.out.println("---1--- for loop ---");

         for(int i = 0; i <3; i++){
             System.out.println(num[i]);
         }

         System.out.println("---2--- while loop ---");

         int i = 0;
         while (i < num.length){
             System.out.println(num[i]);
             i++;
         }

         System.out.println("---3--- for each loop ---");

         for (int nums: num){
             System.out.println(nums);
         }

         System.out.println("---4--- FavName ---");

         System.out.println(FavName[0]);
         System.out.println(FavName[1]);

     //   System.out.println(FavName[5]);    //out of bounds

         System.out.println("---5--- count num ---");

         System.out.println(num.length);
         System.out.println(FavName.length);
         System.out.println(weights.length);
         System.out.println("---6--- end ---");


     }
     }

public class Array_1 {
    public static void main(String[] args) {
        arrayDemo object = new arrayDemo();
       object.multiArray();
        object.array();
        // object.num_1();

    }
}
