package ch09nested.lecture;

public class C11interface {
    public static void main(String[] args) {
//        MyInterface o1 = new MyInterface11();
        //must create class or interface that implements abstract to override
        MyInterface11 o2 = new MyClass111();
        MyInterface11 o3 = new MyInterface11() {
            @Override
            public void method1() {
                System.out.println("C11interface.method1");
            }
        };
    }
}

class MyClass111 implements MyInterface11 {
    @Override
    public void method1() {
        System.out.println("MyClass111.method1");
    }
}
interface MyInterface11 {
    void method1();
}

