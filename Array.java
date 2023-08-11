

public class Array {
    public static void main(String[] args) {
        // Array Declaration and memory allocation
        // int [] Array = new int[5];

        // first array Declaration and then memory allocation
        int [] Array;
        Array = new int[5];
        // Array Initialization
        Array[0] = 4;
        Array[1] = 5;
        Array[2] = 6;
        Array[3] = 7;
        Array[4] = 8;
        // Array[5] = 9;

        System.out.println("The value is is "+Array[0]);
        System.out.println("The value is is "+Array[1]);
        System.out.println("The value is is "+Array[2]);
        System.out.println("The value is is "+Array[3]);
        System.out.println("The value is is "+Array[4]);
        System.out.println();
        // System.out.println("The value is is "+Array[5]);

        // 3. Declaration, memory allocation and initialization together
        int [] Array1 = {1,2,3,4,5};
        System.out.println("The value is is "+Array1[0]);
        System.out.println("The value is is "+Array1[1]);
        System.out.println("The value is is "+Array1[2]);
        System.out.println("The value is is "+Array1[3]);
        System.out.println("The value is is "+Array1[4]);
        // System.out.println("The value is is "+Array1[5]); it will Throws error
    }
}
