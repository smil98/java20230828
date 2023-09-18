package ch14thread.lecture;

public class C09join {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 5; i++) {
                System.out.println("t1 thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();

        try {
            t1.join(); //waits till t1 thread is executed
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for(int i = 0; i < 5; i++) {
            System.out.println("main thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
