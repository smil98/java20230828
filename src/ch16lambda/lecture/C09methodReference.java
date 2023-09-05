package ch16lambda.lecture;

public class C09methodReference {
    public static void main(String[] args) {
        MyInterface09 o1 = (x,y) -> {};

        MyClass09 o2 = new MyClass09();

        MyInterface09 o3 = (x,y) -> x.someMethod(y);
        MyInterface09 o4 = MyClass09::someMethod; //can shorten line 9 to this form
        MyInterface09 o5 = new MyInterface09() {
            @Override
            public void method(MyClass09 myClass09, int a) {

            }
        };
    }
}

class MyClass09 {
    void someMethod(int a) { //equi. int y in MyInterface09

    }
}

interface MyInterface09 {
    void method(MyClass09 x, int y);
}