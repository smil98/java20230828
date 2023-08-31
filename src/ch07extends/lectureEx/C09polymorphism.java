package ch07extends.lectureEx;

public class C09polymorphism {
    public static void main(String[] args) {
        MySubClass091 o1 = new MySubClass091();
        //MySubClass091 is a MyClass09
        MyClass09 o2 = o1;
        //thus can be included as MyClass09

        MyClass09 o3 = new MyClass09();

        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(o2));
        //o1, o2 = same reference address
        System.out.println(System.identityHashCode(o3));

        o1.method1(); //regardless of variable type instance method is processed
        o2.method1(); //processes instance's method
        o3.method1();

        //line 5~9 can be shortened as
        MyClass09 o4 = new MySubClass091();
        System.out.println(System.identityHashCode(o4));
        o4.method1();
    }
}

class MyClass09 {
    void method1() {
        System.out.println("부모 메소드");
    }
}

class MySubClass091 extends MyClass09 {
    @Override
    void method1() {
        System.out.println("자식 메소드");
    }
}
