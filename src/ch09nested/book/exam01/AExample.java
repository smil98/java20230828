package ch09nested.book.exam01;

public class AExample {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
    }
}
