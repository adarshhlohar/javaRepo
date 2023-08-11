class Phone{
    public void showTime(){
        System.out.println("the time is 4:47");
    }

    public void on(){
        System.out.println("Turning on phone");
    }
}

class SmartPhone extends Phone{
    public void  music(){
        System.out.println("Hello Playing music");
    }

    public void on(){
        System.out.println("Turning on SmartPhone");
    }
}




public class dynamicDispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone();
        // obj.showTime();
        // obj.on();

        // SmartPhone obj =  new SmartPhone();
        // obj.music();
        // obj.showTime();
        // obj.on();

        Phone obj = new SmartPhone();
        obj.showTime();
        obj.on();
        // obj.music();   ---->it can give error
    }
}
