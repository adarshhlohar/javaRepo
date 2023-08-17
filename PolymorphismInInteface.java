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

    public void meth(){
        System.out.println("this is meth");
    }
} 



public class PolymorphismInInteface {
    public static void main(String[] args) {
        Camera cam1 = new SmartPhone();
        // cam1.calling(); // -->It will gives an error
        // cam1.meth(); // It will also gives an error

        cam1.record4kVideo();;  //first it will run the override method 
        cam1.takeSnap();

        SmartPhone s = new SmartPhone();
        s.calling();
        s.pickUp();
        s.meth();
        s.takeSnap();
        s.record4kVideo();
        s.recordVideo();
    }
}
