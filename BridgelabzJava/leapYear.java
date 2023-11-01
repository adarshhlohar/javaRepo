import java.util.Scanner;

public class leapYear {
    
    public static void checkLeapYear(int year){
        if (year >= 1552) {
            
            if ((year%4==0 && year%100 != 0) || year%400==0) {
                System.out.println("This is leap year");
            }else{
                System.out.println("This is not leap year");
            } 
        }
        else{
            System.out.println("Entered number is less than 1552");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter the year you want check leap or not");
        year = sc.nextInt();
        checkLeapYear(year);
        sc.close();
    }
}
