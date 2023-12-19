import java.util.*;

public class MultiThreading {

    class A extends Thread {
        public void fun() { // run used for start now fun
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Akhilesh");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException i) {

            }

        }

    }

    public static void main(String[] args) throws InterruptedException {
        MultiThreading multiThreading = new MultiThreading();
        A t = multiThreading.new A(); // Create an instance of A using the outer class instance
        // t.start();
        t.fun();

        for (int i = 1; i <= 5; i++) {
            System.out.println("himanshu");
            Thread.sleep(1000);
        }
    }
}
