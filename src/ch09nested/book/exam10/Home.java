package ch09nested.book.exam10;

public class Home {
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("Turn on TV");
        }

        @Override
        public void turnOff() {
            System.out.println("Turn off TV");
        }
    };

    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    public void use2() {
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Turn on Air Conditioner");
            }

            @Override
            public void turnOff() {
                System.out.println("Turn off Air Conditioner");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    public void use3(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }
}
