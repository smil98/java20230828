package ch09nested.lecture;

public class C07localClass {

    void method() {
        int value = 0; //effectively final
        /* variable used in local class in class right above it
        * cannot be changed after initialization */

        class LocalClass {
            void method1() {
                System.out.println(value);
            }
        }
    }

    void method2(int param) {
        //if parameter is used in local class its also effectively final

        class LocalClass {
            void method() {
                System.out.println(param);
            }
        }
    }
}
