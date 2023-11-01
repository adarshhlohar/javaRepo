import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First String :");
        String str1 = sc.next();
        
        System.out.println("Enter First String :");
        String str2 = sc.next();

        if(str1.equals(str2)){
            System.out.println("str1 And str2 is Same");
        }
        else{
            System.out.println("The str1 And str2 Both Are Different");
        }
        sc.close();
    }
}
