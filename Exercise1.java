import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter physics marks : ");
        int Physics = sc.nextInt();
        System.out.println("Enter English Marks : ");
        int English = sc.nextInt();
        System.out.println("Enter Chemistry Marks : ");
        int Chemistry = sc.nextInt();
        System.out.println("Enter Maths Marks : ");
        int Maths = sc.nextInt();
        System.out.println("Enter Computer Science Marks : ");
        int Computer = sc.nextInt();

        float percentage = ((Physics+Chemistry+English+Maths+Computer)/500.0f)*100;
        System.out.println("Percentage : ");
        System.out.println(percentage);
    }
}
