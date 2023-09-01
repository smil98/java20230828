package ch09nested.lecture;

public class C04access {
    //static member cannot access to instance member
    //instance member can access to static
    int instanceField;
    static int staticField;
    class InnerClass {
        void method1() {
            System.out.println(instanceField);
            System.out.println(staticField);
        }

        static void method2() {
//            System.out.println(instanceField); error
        }
    }

    static class StaticNestedClass {
        void method1() {
//            System.out.println(instanceField);
        }
    }




}
