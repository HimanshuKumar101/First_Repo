import java.util.*;

public class Multithreadingrunnable {

    class A implements Runnable {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("child thread");
            }
        }
    }

    class B {
        public static void main(String[] args) {
            Multithreadingrunnable multithreadingrunnable = new Multithreadingrunnable();
            A r = multithreadingrunnable.new A();

            Thread t = new Thread(r);
            t.start();

            for (int i = 1; i <= 5; i++) {
                System.out.println("main thread");
            }
        }
    }
}
