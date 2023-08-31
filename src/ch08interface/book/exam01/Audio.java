package ch08interface.book.exam01;

public class Audio implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("이건 다른 예제 꺼라서 사용x 그냥 재정의해둠");
    }
}
