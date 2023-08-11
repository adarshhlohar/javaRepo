public class methodOverloading {
    static void foo(){
        System.out.println("there is nothing in  foo");
    }
    static void foo(int a , int b){
        System.out.println("there is two value in  foo "+ a +" and "+ b);
    }
    static void foo(int a,int b, int c){
        System.out.println("there is three value  in  foo "+ a + ", "+ b  + " and "+c);
    }
    static int change(int y){
        y = 54;
        return y;
    }

    static void changeArr(int[] arr){
        arr[0] = 9;
    }
    public static void main(String[] args) {
        // case 1: Changing the integer
        // int x =45;
        // change(x);
        // System.out.println("The value after returning the value change is : "+ x);

        // case 2  : changing in the array
        // int [] Array = {1,2,3,4,5,6};
        // changeArr(Array);
        // System.out.println(Array[0]);

        // method Overloading
        foo();
        foo(1,2);
        foo(1,2,3);
    }
}
