package ch08extends.bookEx.sec07.exam13.package2;

import ch08extends.bookEx.sec07.exam13.package1.A;

public class D extends A {
    public D() {
        super();
    }

    public void method1() {
        this.field = "value";
        this.method();
    }

    public void method2() {
//        A a = new A();
//        a.field = "value";
//        a.method();
    }
}
