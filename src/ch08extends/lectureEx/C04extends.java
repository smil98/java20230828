package ch08extends.lectureEx;

public class C04extends {
    public static void main(String[] args) {
        MySubClass041 o1 = new MySubClass041();
        o1.method01();
        o1.method02();

        MySubClass042 o2 = new MySubClass042();
        o2.method03();
    }
}

class MyClass04 {
    void method01() {
        System.out.println("MyClass04.method01");
    }
}
class MySubClass041 extends MyClass04 {
    private int age;

    void method02() {
        System.out.println("MySubClass041.method02");
    }
}

class MySubClass042 extends MyClass04 {
    void method03() {
        System.out.println("MySubClass042.method3");
    }
}


