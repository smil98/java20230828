package ch16lambda.lecture;

public class C10constructorReference {
    public static void main(String[] args) {
        MyInterface10 o1 = () -> new MyClass10();
        //if parameter are same, can abridge
        MyInterface10 o2 = MyClass10::new;

    }
}

class MyClass10 {
    //constructor automatically formed here
}

@FunctionalInterface
interface MyInterface10 {
    MyClass10 method();
}
