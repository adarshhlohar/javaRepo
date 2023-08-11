import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors {
    public static void main(String[] args) {
        System.out.println("Enter 0 for rock 1 for Paper and 2 for Scissors");
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        Random rand = new Random();
        int computerInput = rand.nextInt(3);
        // System.out.println("The computer entered input is : " + computerInput);
        if(computerInput == 0){
            System.out.println("Computer choose : rock");
        }
        if(computerInput == 1){
            System.out.println("Computer choose : paper");
        }
        if(computerInput == 2){
            System.out.println("Computer choose : scissors");
        }

        if (computerInput == userInput) {
            System.out.println("Its a draw....");
        }
        else if(userInput==0 && computerInput == 2 || userInput == 1 && userInput == 0 || userInput == 2 && computerInput == 1 ){
            System.out.println("You won!");
        }
        else{
            System.out.println("Computer win");
        }
    }
}
