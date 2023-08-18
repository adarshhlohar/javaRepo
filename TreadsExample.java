class Thread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while ( i < 100) {
            System.out.println("Hello this me working with thread one");
            System.out.println("i am happy");
            i++;
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Hello this me working with thread Two 2");
            System.out.println("I am Sad");
            i++;
        }
        }
}

public class TreadsExample {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
