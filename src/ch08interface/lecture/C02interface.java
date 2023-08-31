package ch08interface.lecture;

public class C02interface {
    public static void main(String[] args) {
        MyClass21 o1 = new MyClass21();
        MyInterface02 i2 = o1; //has same instance
        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(i2));
        //identical

        MyInterface02 i3 = new MyClass21();
        System.out.println(System.identityHashCode(i3));

        i3.method1();
        i3.method2();

        MyInterface02 i4 = new MyClass22();
        i4.method1();
        i4.method2();
    }
}

interface MyInterface02 {
    public abstract void method1();
    //since default method = public abstract, you don't have to define access modifier
    void method2(); //method2 = public abstract void
}

//to inherit interface, use implements keyword
class MyClass21 implements MyInterface02 {
    @Override
    public void method1() {
        System.out.println("MyClass21.method1");
    }

    @Override
    public void method2() {
        System.out.println("MyClass21.method2");
    }
}

class MyClass22 implements MyInterface02 {
    @Override
    public void method1() {
        System.out.println("MyClass22.method1");
    }

    @Override
    public void method2() {
        System.out.println("MyClass22.method2");
    }
}