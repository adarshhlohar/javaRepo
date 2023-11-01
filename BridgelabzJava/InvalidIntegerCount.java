import java.util.Scanner;

public class InvalidIntegerCount {
    public static void main(String[] args) {
        int sum = 0;
        int invalidCount = 0;

        Scanner sc = new Scanner(System.in);
        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Argument " + arg);
                invalidCount++;
            }
        }

        System.out.println("The total sum is : " + sum);
        System.out.println("The Invalid Count is : " + invalidCount);
        sc.close();
    }
}
