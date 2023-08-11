public class PracticeSet6 {
    public static void main(String[] args) {
        /*
         * // Problem 1
         * float [] Marks = {4.5f,6.5f,7.5f,9.5f,9};
         * float sum = 0;
         * for (int i = 0; i < Marks.length; i++) {
         * sum += Marks[i];
         * }
         * System.out.println("The sum of all subject  marks is  : "+sum);
         */

        /*
         * // Problem 2
         * float [] Marks = {4.5f,6.5f,7.5f,9.5f,9};
         * float num = 4.5f;
         * boolean isInArray = false;
         * 
         * for(float elem : Marks){
         * if(elem == num){
         * isInArray = true;
         * break;
         * }
         * }
         * 
         * if(isInArray == true){
         * System.out.println("The value is in the Array");
         * }
         * else{
         * System.out.println("The num value can not been in the  Array");
         * }
         */

        /*
         * // Problem 3
         * float [] Marks = {4.5f,6.5f,7.5f,9.5f,9};
         * float sum = 0;
         * int l = Marks.length;
         * for (int i = 0; i < Marks.length; i++) {
         * sum += Marks[i];
         * }
         * System.out.println("The average of the all the value in the array " + sum/l);
         */

        /*
         * 
         * // Problem 4 Matrix Addition
         * int [][] mat1 ={{1,2,3},{3,4,5}};
         * int [][] mat2 ={{3,4,5},{1,2,3}};
         * int [][] res = {{0,0,0},{0,0,0}};
         * 
         * for (int i = 0; i < mat1.length; i++) {
         * for (int j = 0; j < mat1[i].length; j++) {
         * res[i][j] = mat1[i][j] + mat2[i][j];
         * }
         * }
         * 
         * for (int i = 0; i < res.length; i++) {
         * for (int j = 0; j < res[i].length; j++) {
         * System.out.print(res[i][j] + " ");
         * }
         * System.out.println();
         * }
         */

        /*
         * //Problem 5
         * int [] Array = {1,2,3,4,5,6,7};
         * int l = Array.length;
         * int n = Math.floorDiv(l, 2);
         * for (int i = 0; i < n; i++) {
         * int temp;
         * temp = Array[i];
         * Array[i] = Array[l-i-1];
         * Array[l-i-1] = temp;
         * }
         * System.out.println("Printing the reverse Array");
         * for(int i = 0; i < Array.length ; i++){
         * System.out.print(Array[i] + " ");
         * }
         */

         /* 
        //  Problem 6 maximum Element in the Array
        int [] Marks = {90,99,54,67,74};
        int max = Marks[0];
        for (int i = 0; i < Marks.length; i++) {
            if (Marks[i] > max) {
                max = Marks[i];
            }
        }
        System.out.println("The max value in the Array is " + max);
        */

        // Problem 7 Checking the Array is Sorted or not
        int [] Marks ={2,4,5,7,13,23,53};
        boolean isSorted = true;

        for (int i = 0; i < Marks.length - 1; i++) {
            if(Marks[i] > Marks[i+1]){
                isSorted = false;
                break;
            }
        }

        if (isSorted==true) {
            System.out.println("the Array is sorted");
        } else {
            System.out.println("The Array is not Sorted");
        }
    }
}
