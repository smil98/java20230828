package ch11exception.lecture;

public class C19throws {
    public static void main(String[] args) throws ClassNotFoundException {
        method1();
    }
    public static void method1() throws ClassNotFoundException {
        method2();
    }
    public static void method2() throws ClassNotFoundException {
        method3();
    }
    public static void method3() throws ClassNotFoundException {

    }
}
/* If exception occurs but you have other codes
that needs to be processed afterward,
use try-catch block
*
* */