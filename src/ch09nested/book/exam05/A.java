package ch09nested.book.exam05;

public class A {
    String field = "A-field";

    void method() {
        System.out.println("A-method");
    }

    class B {
        String field = "B-field";

        void method() {
            System.out.println("B-method");
        }

        void print() {
            System.out.println(this.field);
            this.method();

            System.out.println(A.this.field);
            A.this.method();//using instance A's field and method
        }
    }

    void useB() {
        B b = new B();
        b.print();
    }
}
