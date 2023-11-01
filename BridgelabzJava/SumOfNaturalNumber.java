import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of u want check the sum");
        int num = sc.nextInt();
        int sum =0;
        while(num!=0){
            sum += num;
            num--;
        }
        System.out.println("The sum of Natural number is :" +sum);
        sc.close();
    }
}
