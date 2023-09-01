package ch09nested.lecture;

public class C01nested {
    public static void main(String[] args) {
//        MyClass01.NestedClass01 o1 = new MyClass01.NestedClass01();
        MyClass01 o1 = new MyClass01();
        MyClass01.NestedClass01 o2 = o1.new NestedClass01();
        //if you want to use nested class in other class, must create instance like this
    }

}

class MyClass01 {
    //nested class
    class NestedClass01 {

    }

    void method1() {
        NestedClass01 o1 = new NestedClass01();
    }
}