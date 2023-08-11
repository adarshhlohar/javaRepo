
public class removingDuplicteElement {

    static int removeDuplicate(int a[], int n) {
        {
            if (n == 0 || n == 1) {
                return n;
            }
     
            // creating another array for only storing
            // the unique elements
            int[] temp = new int[n];
            int j = 0;
     
            for (int i = 0; i < n - 1; i++) {
                if (a[i] != a[i + 1]) {
                    temp[j++] = a[i];
                }
            }
     
            temp[j++] = a[n - 1];
     
            // Changing the original array
            for (int i = 0; i < j; i++) {
                a[i] = temp[i];
            }
     
            return j;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 23, 42, 51, 51, 32, 65, 23, 42 };
        int len = arr.length;
        System.out.println("the length is " + len);
        System.out.println("Printing original problems\n");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        removeDuplicate(arr, len);
        System.out.println("Printing removing duplicate problems\n");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
