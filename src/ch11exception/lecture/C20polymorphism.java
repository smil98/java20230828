package ch11exception.lecture;

public class C20polymorphism {
    public static void main(String[] args) throws ReflectiveOperationException  {
        method1();
    }

    public static void method1() throws ReflectiveOperationException {
        method2();
    }

    public static void method2() throws ClassNotFoundException {

    }
}
