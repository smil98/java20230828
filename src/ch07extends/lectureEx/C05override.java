package ch07extends.lectureEx;

public class C05override {
    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05();
        MySubClass051 o2 = new MySubClass051();
        o1.method01();
        o2.method01();
        o2.method02();

    }
}

class MyClass05 {
    public void method01() {
        System.out.println("어떤 기능");
    }
}

class MySubClass051 extends MyClass05 {
    @Override
    public void method01() {
        System.out.println("변경된 기능");
    }

    public void method02() {
        System.out.println("추가된 기능");
    }
}