import java.util.Scanner;
public class swich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The value of var : ");
        int var = sc.nextInt();

        switch (var) {
            case 1:
                System.out.println("Youre entered the value 1");
                break;
            case 2:
                System.out.println("Youre Entered the value 2 ");
                break;
            case 3:
                System.out.println("Youre Entred the value 3 " );
                break;
            case 4:
                System.out.println("Youre Entred the value 4 " );
                break;
            default:
                System.out.println("You havan't entered the 1 2 3 and 4");
                break;
        }

        String var1 ="adarsh";
        switch (var1) {
            case "Sameer" -> System.out.println("Hello Sameer");
            case "Adarsh" -> System.out.println("Hello Adarsh");
            default -> System.out.println("Youre Entered Wrong Name");
        }
    }
}
