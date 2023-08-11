
class base{
    base(){
        System.out.println("This is base constructor");
    }

    base(int x){
        System.out.println("The base class constructor the value of x is : " + x);
    }
};

class derived extends base{
    derived(){
        System.out.println("This is derived constructor");
    }

    derived(int x ){
        System.out.println("This is the derived class constructor the value is : "+x);
    }

    derived(int x,int y){
        super(x);
        System.out.println("this is the derived class the value of y is : " + y);
    }
};

class childOfDerived extends derived{
    childOfDerived(){
        System.out.println("This is the child of derived class");
    }
    childOfDerived(int x){
        super(x);
        System.out.println("The value of child of derived in constructor the value of x  : "+ x);
    }
    childOfDerived(int x,int y){
        super(x);
        System.out.println("The value of child of derived in constructor the value of y: "+ y);
    }
    childOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("The value of child of derived in constructor the value of z is : "+ z);
    }
};

public class constructorInheritance {
    public static void main(String[] args) {
        base b = new base();
        derived d = new derived(10);
        childOfDerived  cd = new childOfDerived(2,3,6);
    }
}
