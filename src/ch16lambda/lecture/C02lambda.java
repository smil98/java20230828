package ch16lambda.lecture;

public class C02lambda {
    public static void main(String[] args) {
        MyInterface02 o1 = () -> {
            System.out.println("C02lambda.method");
        };
        o1.method();
        MyInterface02 o2 = () -> System.out.println("if method's code equivalent to one line can exclude {}");
    }
}

interface MyInterface02 {
    void method();
}