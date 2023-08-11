class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class cellPhone {
    public void callFriend() {
        System.out.println("Calling a Friend shaam...");
    }

    public void vibrate() {
        System.out.println("Vibrating the phone...");
    }

    public void ring() {
        System.out.println("Ringing The phone...");
    }
}

class Square {
    int Side;

    public int Area() {
        return Side * Side;
    }

    public int Perimeter() {
        return 4 * Side;
    }
}


class Tommy{
    public void fire(){
        System.out.println("Firing on the Enenmy");
    }
    public void hit(){
        System.out.println("Hitting on the Enenmy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
}
public class practiceSet7 {
    public static void main(String[] args) {
        /*
         * // Problem 1
         * Employee Adarsh = new Employee();
         * Adarsh.salary = 560000;
         * Adarsh.setName("Addi");
         * System.out.println(Adarsh.getName());
         * System.out.println(Adarsh.getSalary());
         * }
         * 
         * // Problem 2
         * cellPhone Asus = new cellPhone();
         * Asus.callFriend();
         * Asus.ring();
         * Asus.vibrate();
         
         // Problem 3
         Square Sq = new Square();
         Sq.Side = 4;
         int Area = Sq.Area();
         int Perimeter = Sq.Perimeter();
         
         System.out.println("The area of square is : " + Area + "\nThe perimeter of Square is : " + Perimeter);
         */

        //  Problem 5 
        Tommy player1 = new Tommy();
        player1.fire();
        player1.hit();
        player1.run();
    }
}