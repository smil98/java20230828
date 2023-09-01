package ch09nested.book.exam04;

public class A {
    int field1;
    void method1() {}

    static int field2;
    static void method2() {}

    class B {
        void method() {
            field1 = 10;
            method1(); //instance can access to static
            field2 =10;
            method2();
        }
    }

    static class C {
        void method() {
//            field1 = 10;
//            method1();
            field2 = 10;
            method2(); //cannot access to instance but can access to static
        }
    }
}
