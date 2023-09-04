package ch16lambda.lecture;

public class C06methodReference {
    public static void main(String[] args) {
        MyInterface06 o1 = a -> {};
        MyInterface06 o2 = C06methodReference::someMethod;
        //if method exists within same class for reference, can abbreviate to such form

    }

    public static void someMethod(int x) {

    }
}

interface MyInterface06 {
    void method(int a);
}
