import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionPrg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X");
        int x= sc.nextInt();
        System.out.println("Enter y");
        int y = sc.nextInt();

        try{
            try{
                System.out.println(x/y);
            }catch(InputMismatchException e){
                System.out.println(e);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
