package ch08extends.lectureEx;

public class C06override {
    public static void main(String[] args) {
        MySubClass061 o1 = new MySubClass061();
        o1.method10();
    }
}

class MyClass06 {
    public void method10() {
        System.out.println("부모 클래스의 메소드");
    }
}
class MySubClass061 extends MyClass06 {
    @Override //annotation: 컴파일시 재정의한 메소드인지 검증함
    public void method10() {
        System.out.println("서브 클래스의 메소드");
    }
}

