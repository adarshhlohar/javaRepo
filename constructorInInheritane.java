class base{
    base(){
        System.out.println("This is a base class constructor");
    }

    base(int x){
        System.out.println("The value of x in base is : "+x);
    }
};


class derived extends base{
    derived(){
        super(5);
        System.out.println("This is the derived class : ");
    }
    derived(int x,int y){
        super(x);
        System.out.println("The value of y is : "+y);
    }
};

public class constructorInInheritane {
    public static void main(String[] args) {
        base obj = new base(4);
        derived obj2 = new derived(10,20);
    }
}
