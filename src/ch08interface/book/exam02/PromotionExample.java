package ch08interface.book.exam02;

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a; //interface variable announced

        a = b;
        a = c;
        a = d;
        a = e; //automatic type conversion
    }
}
