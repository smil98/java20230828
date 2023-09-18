package ch14thread.lecture;

public class C10concurrency {
    private static int value = 0;


    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
                value++;
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
           for(int i =0; i < 10000; i++) {
               value++;
           }
        });
        t2.start();

        try {
            t1.join();
            t2.join(); //may not work depending on CPU
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //multiple threads fixing value simultaneously = not recommended

        System.out.println("value = " + value);
    }
}
