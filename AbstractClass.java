abstract class Parent{
    public Parent(){
        System.out.println("This is parent class constructor");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();
}


class Child extends Parent{
    public void greet(){
        System.out.println("good morining");
    }
}

abstract class Child2 extends Parent{
    public void the(){
        System.out.println("I am good");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // Parent p = new Parent();  --->This will you an error
        Child c = new Child();
        c.sayHello();
        c.greet();

        Parent p = new Child();
        p.sayHello();
        p.greet();

        // Child2 c2 = new Child2();  -->It can throws an error it is abstract class we cant create its object

        
    }
}
