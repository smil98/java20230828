package ch07extends.lectureEx;

public class C23constructor {
    public static void main(String[] args) {
        MySubClass231 o1 = new MySubClass231();
    }
}


class MyClass23 {
    // MyClass23() {} automatically inserted by compiler
}

class MySubClass231 extends MyClass23 {
    // MySubClass231() {super();} automatically inserted by compiler
}