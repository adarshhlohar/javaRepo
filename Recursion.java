import java.util.Scanner;

public class Recursion {
    static int Recursion(int x){
        if(x == 0 || x == 1){
            return 1;
        }
        else{
            return x*Recursion(x-1);
        }
    }

    static int Recursion_itrative(int x){
        int result = 1;
        for(int i = 1; i<=x; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("finding the Recursion of you have entered : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int value = Recursion(n);
        System.out.println("The value in recursion is : " + value);

        int value1 = Recursion_itrative(n);
        System.out.println("The value in using the itrative aproach is : " + value1);

    }
}
