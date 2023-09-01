package ch08interface.lecture;

public class C12private {
}

interface MyInterface12 {
    default void method1() {
        someFeature();
        System.out.println("어떤 기능2");
    }

    default void method2() {
        someFeature();
        System.out.println("어떤 기능3");
    }

    private void someFeature() {
        System.out.println("어떤 기능1");
    }
}