package ch11exception.lecture;

public class C13throw {
    public static void main(String[] args) {
        System.out.println("main code1");
        try {
            method1();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
            System.err.println(e);
            System.err.flush();
        }
        System.out.println("main code2");

    }

    public static void method1() {
        System.out.println("code1");
        throw new RuntimeException();
//        System.out.println("code2");
    }

    public static void method2() {
//        throw new Exception();
    }
}
