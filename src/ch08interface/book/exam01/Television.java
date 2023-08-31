package ch08interface.book.exam01;

public class Television implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("이건 다른 예제 꺼라서 사용x 그냥 재정의해둠");
    }
}
