package ch09nested.book.exam07;

public class A {
    public void method1(int arg) {
        int var = 1;

        class B {
            void method2() {
                System.out.println("arg = " + arg);
                System.out.println("var = " + var);

                //cannot change var here since var is effectively final
            }
        }

        B b = new B();
        b.method2();

        //cannot change arg nor var here since int arg is also final int
    }
}
