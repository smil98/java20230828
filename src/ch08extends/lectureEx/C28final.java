package ch08extends.lectureEx;

public class C28final {
}

class MyClass28 {
    final void method1() {
        System.out.println("random");
    }
}

class MySubClass28 extends MyClass28 {
//    void method1() {} cannot override
}
