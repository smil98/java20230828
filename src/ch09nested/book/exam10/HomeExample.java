package ch09nested.book.exam10;

public class HomeExample {
    public static void main(String[] args) {
        Home home = new Home();
        home.use1();
        home.use2();
        home.use3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Turn on heater");
            }

            @Override
            public void turnOff() {
                System.out.println("Turn off heater");
            }
        });
    }
}
