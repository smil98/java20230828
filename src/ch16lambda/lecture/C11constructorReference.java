package ch16lambda.lecture;

public class C11constructorReference {
    public static void main(String[] args) {
        MyInterface11 o1 = z -> new MyClass11(z);
        //if parameter are the same, can abridge
        MyInterface11 o2 = MyClass11::new;


    }
}

class MyClass11 {
    MyClass11(int a) {}
}
@FunctionalInterface
interface MyInterface11 {
    MyClass11 method1(int x);
}
