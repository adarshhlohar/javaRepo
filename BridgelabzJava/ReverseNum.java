import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to reverse");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;
        int  reminder = 0;
        while (num != 0) {
            reminder = num%10;
            reverse = (reverse*10) + reminder;
            num = num/10;
        }

        System.out.println("the reverse val is :" + reverse);
        sc.close();
    }
}
