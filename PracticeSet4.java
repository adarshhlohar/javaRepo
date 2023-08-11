import java.util.Scanner;

public class PracticeSet4 {
    public static void main(String[] args) {
        // // problem 1.
        // int a = 10;
        // // if a = 10 in if statement it does not work it assign(=) the value value if
        // if(a == 10){
        // System.out.println("I am 11");
        // }
        // else{
        // System.out.println("I am not 11");
        // }

        // // problem 2.
        // Scanner sc = new Scanner(System.in);
        // byte m1, m2, m3;
        // float avg;
        // System.out.println("Enter The marks of physics : ");
        // m1 = sc.nextByte();
        // System.out.println("Enter The marks of chemistry : ");
        // m2 = sc.nextByte();
        // System.out.println("Enter The marks of Maths : ");
        // m3 = sc.nextByte();

        // avg = (m1 + m2 + m3) / 3.0f;
        // System.out.println("The average is : " + avg);
        // if (avg > 40 && m1 > 33 && m2 > 33 && m3 > 33) {
        // System.out.println("Congratulations , you have been Promoted");
        // }
        // else{
        // System.out.println("Sorry! You have not been Promoted ! please try again");
        // }

        // // problem 3
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the income in lakhs annual : ");
        // float income = sc.nextFloat();
        // float tax = 0f;

        // if(income <= 2.5f){
        // tax = tax + 0;
        // }
        // else if (income > 2.5f && income <= 5.0f) {
        // tax = tax + 0.05f * (income - 2.5f);
        // }
        // else if(income > 5.0f && income <= 10.0f ){
        // tax = tax + 0.05f * (5.0f - 2.5f);
        // tax = tax + 0.20f * (income - 5.0f);
        // }
        // else if (income > 10.f) {
        // tax = tax + 0.05f * (5.0f -2.5f);
        // tax = tax + 0.20f * (10.0f - 5.0f);
        // tax = tax + 0.30f * (income - 10.0f);
        // }
        // System.out.println("The total tax paid by the employee is : "+ tax);

        // // problem 4 :
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of day : ");
        // int day = sc.nextInt();

        // switch (day) {
        // case 1 -> System.out.println("This is monday");
        // case 2 -> System.out.println("This is tuesday");
        // case 3 -> System.out.println("This is Wednesday");
        // case 4 -> System.out.println("This is Thursday");
        // case 5 -> System.out.println("This is Friday");
        // case 6 -> System.out.println("This is Saturday");
        // case 7 -> System.out.println("This is Sunday");
        // default -> System.out.println("Youre Entered wrong number");
        // }

        // Problem 6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a any Website name");
        String website = sc.next();

        if (website.endsWith(".org")) {
            System.out.println("This is organzational website");
        } else if (website.endsWith(".com")) {
            System.out.println("This is Commercial Website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is a indian website");
        }
    }
}