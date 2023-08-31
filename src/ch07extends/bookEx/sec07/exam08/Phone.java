package ch07extends.bookEx.sec07.exam08;

public abstract class Phone {
    String owner;

    Phone(String owner) {
        this.owner = owner;
    }

    void turnOn() {
        System.out.println("폰 전원을 킵니다.");
    }

    void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }
}
