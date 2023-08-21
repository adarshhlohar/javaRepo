abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    public void write(){
        System.out.println("Write");
    }
    public void refill(){
        System.out.println("refill");
    }

    public void changNib(){
        System.out.println("changing the name");
    }
}

// --------------------------------------------------------------



class Monkey{
    void jump(){
        System.out.println("Jumping.........");
    }

    void bite(){
        System.out.println("Biting......");
    }
}

interface BasicAnimal{
    void eat();
    void sleep(); 
}


class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello Sir");
    }

    public void eat(){
        System.out.println("Eating.......");
    }

    public void sleep(){
        System.out.println("Sleeping.......");
    }
}

// -------------------------------------------------------------------------

abstract class Telephone{
    abstract void ring();
    abstract void  lift();
    abstract void disconnect();
}

class SmartTelePhone extends Telephone{
    public void ring(){
        System.out.println("Ringing........");
    }

    public void lift(){
        System.out.println("Lifting............");
    }
    public void disconnect(){
        System.out.println("Disconneting.........");
    }
}
public class practiceSet11 {
    public static void main(String[] args) {

        // Problem1
        // FountainPen obj = new FountainPen();
        // obj.changNib();

        // problem2
        Human Adarsh = new Human();
        Adarsh.speak();
        Adarsh.bite();

        Monkey m1 = new Human();
        m1.bite();
        m1.jump();
        // m1.speak();  // it will can not be run

        BasicAnimal lovish = new Human();
        lovish.sleep();
        lovish.eat();
        // lovish.speak();   --->It can be Speak The bacic Animal can only sleep And eat


        // Problem 3
        Telephone obj1 = new SmartTelePhone();
        obj1.lift();
        obj1.disconnect();
        obj1.ring();

        // SmartPhone sm = new Telephone();
        // sm.ring();
        // sm.lift();
        // sm.disconnect();

        SmartTelePhone tel = new SmartTelePhone();
        tel.ring();
        tel.lift();
        tel.disconnect();

    }
}
