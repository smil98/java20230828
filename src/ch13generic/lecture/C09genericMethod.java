package ch13generic.lecture;

public class C09genericMethod {
    public static void main(String[] args) {
        MyClass09 o1 = new MyClass09();
        o1.<Object>method(new Object());
        o1.<String>method("java");
        //not commonly used, just know the theory

        o1.method(new Object());
        o1.method("java");
        //best if used in this form cuz parameter identifies the type

        String s = o1.method1();
        Object t = o1.method1();
        //can deduce what type by the variable type thus can omit

        System.out.println(s);
        System.out.println(t);

    }
}

class MyClass09 {
    public<T> void method(T param) {
        //instead of overloading for all types of parameters, can use generic method

    }

    public <T> T method1() {
        return null;
    }
}
