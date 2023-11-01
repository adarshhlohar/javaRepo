import java.util.Scanner;

public class SingleDigitToWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a single-digit number: ");
        int number = sc.nextInt();
        sc.close();

        String word = "";

        switch (number) {
            case 0:
                word = "Zero";
                break;
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            case 6:
                word = "Six";
                break;
            case 7:
                word = "Seven";
                break;
            case 8:
                word = "Eight";
                break;
            case 9:
                word = "Nine";
                break;
            default:
                System.out.println("Invalid input. Please enter a single-digit number.");
                return;
        }

        System.out.println("The number " + number + " in words is: " + word);
    }
}
