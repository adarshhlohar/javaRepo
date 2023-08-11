import java.util.Scanner;

public class practiceSet {
    public static void main(String[] args) {
        // problem 1.
        // float a = 7/4.0f * 4/2.0f;
        // System.out.println(a); 

        // problem 2.
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        grade = (char)(grade - 8);
        System.out.println(grade);

        // problem 3.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check greater than 8 or not");
        int a = sc.nextInt();
        System.out.println(a>8);
        System.out.println(7*49/7+35/7);
    }
}
