package ch14thread.lecture;

import java.awt.*;

public class C05runnable {
    public static void main(String[] args) {
        Runnable r1 = new MyRunnable();
        Runnable r2 = new YourRunnable();
        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);
        thread1.start();
        thread2.start();
    }
}
//Runnable : functional interface
class YourRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("ding");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}