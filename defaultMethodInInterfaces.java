interface Camera{
    void takeSnap();
    void recordVideo();
    default void record4kVideo(){
        greet();
        System.out.println("Record in 4k video");
    }  
    private void greet(){
        System.out.println("Hello Good morning");
    }
} 

class CellPhone{
    void pickUp(){
        System.out.println("connecting.....");
    }
    void calling(){
        System.out.println("Calling to....");
    }
}

interface Wifi{
    void connnetingNetwork(String network);
}

class SmartPhone extends CellPhone implements Camera,Wifi{
    public void takeSnap(){
        System.out.println("taking photo");
    }
    public void recordVideo(){
        System.out.println("Recording video in normal camera ");
    }


    public void connnetingNetwork(String network){
        System.out.println("Connecting to the network whose name is : " + network);
    }

    // @Override
    // public void record4kVideo(){
    //     System.out.println("recording in 4k and click to snap");
    // }

} 
public class defaultMethodInInterfaces {
    public static void main(String[] args) {
        SmartPhone sm = new SmartPhone();
        sm.calling();
        sm.pickUp();
        sm.connnetingNetwork("adarsh");
        sm.takeSnap();
        sm.recordVideo(); 

        // running the default record4kVideo Method
        sm.record4kVideo();
        // sm.greet(); // can not use because this is private method
    }
}
