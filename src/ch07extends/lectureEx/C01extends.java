package ch07extends.lectureEx;

public class C01extends {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        o1.age = 33;
        o1.method01();

        MySubClass011 o2 = new MySubClass011();
        o2.age = 44;
        o2.method01();

    }
}

//extends inherits method and field of MyClass01 to MySubClass011
class MySubClass011 extends MyClass01 {
    @Override
    void method01() {
        System.out.println("MySubClass011.method01");
    }
}

class MyClass01 {
    int age;

    void method01() {
        System.out.println("MyClass01.method01");
    }
}