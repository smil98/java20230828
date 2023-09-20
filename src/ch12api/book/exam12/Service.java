package ch12api.book.exam12;

public class Service {
    @PrintAnnotation
    public void method1() {
        System.out.println("process 1");
    }

    @PrintAnnotation("*")
    public void method2() {
        System.out.println("process 2");
    }

    @PrintAnnotation(value="#", number =20)
    public void method3() {
        System.out.println("process 3");
    }
}
