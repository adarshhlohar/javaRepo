import java.util.Scanner;

public class NumberPlaceValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1, 10, 100, or 1000): ");
        int number = sc.nextInt();
        sc.close();

        if (number>=0 && number <=1000) {
            int units, tens, hundreds;

            units = number % 10;
            tens = (number / 10) % 10;
            hundreds = (number / 100) % 10;

            System.out.println("Number: " + number);
            System.out.println("Hundreds place: " + hundreds);
            System.out.println("Tens place: " + tens);
            System.out.println("Units place: " + units);
        } else {
            System.out.println("Invalid input. Please enter 1, 10, 100, or 1000.");
        }
    }
}
