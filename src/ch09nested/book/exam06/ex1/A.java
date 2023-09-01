package ch09nested.book.exam06.ex1;

public class A {
    A() {
        class B {}
        B b = new B();
    }

    void method() {
        class B{}
        B b = new B();
    }
}
