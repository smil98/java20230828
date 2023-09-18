package ch14thread.lecture;

import java.awt.*;

public class C07lambda {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for(int i = 0; i < 5; i++) {
                System.out.println("ding");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for(int i = 0; i < 5; i++) {
                toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
