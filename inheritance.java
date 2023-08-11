class Base{
    public int a;

    public void setA(int a){
        System.out.println("I am in base and setting a now");
        this.a = a;
    }
    public int getA(){
        return a;
    }
}

class derived extends Base{
    public int b;

    public int getB(){
        return b;
    } 
    public void setB(int b){
        this.b = b;
    }
}



public class inheritance {
    public static void main(String[] args) {
        Base b  = new Base();
        b.setA(12);
        System.out.println("The value of a in base is : "+b.getA());

        derived d = new derived();
        d.setA(122);
        System.out.println("The value of a in derived is : "+ d.getA());
        d.setB(23);
        System.out.println("The value of b is in derived class is : "+ d.getB());
    }
}
