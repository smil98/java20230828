package ch08interface.lecture;

public class C03interface {
    public static void main(String[] args) {
        MyClass03 o1 = new MyClass03();
        //can use both methods of interface031 and interface032
        o1.method1();
        o1.method2();

        MyInterface031 i1 = o1;
        MyInterface032 i2 = o1;

        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2)); //identical
    }
}

interface MyInterface031 {
    void method1();
}

interface MyInterface032 {
    void method2();
}

class MyClass03 implements MyInterface031, MyInterface032 {
    @Override
    public void method1() {
        System.out.println("MyClass03.method1");
    }

    @Override
    public void method2() {
        System.out.println("MyClass03.method2");
    }

}
