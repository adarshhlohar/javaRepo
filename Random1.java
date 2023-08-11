import java.util.Scanner;
import java.util.Random;
public class Random1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int data = sc.nextInt();
        // System.out.println(data);

        Random rand = new Random();
       int var =  rand.nextInt(5);
       System.out.println(var);
    }
}
