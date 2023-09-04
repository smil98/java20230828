package ch09nested.lecture;

public class C09anonymous {
    public static void main(String[] args) {
        MyClass09 o1 = new MySubClass091();

        o1.method1();
        //anonymous class - class w/o name
        MyClass09 o2 = new MyClass09() {
            //write field, method here
            //since from initialization method and field was defined its anonymous

            @Override
            void method1() {
                System.out.println("C09anonymous.method1");
            }
        };
        //line 7 equivalent to line 5
        //{} equals to MySubClass's body

        o2.method1();
    }
}

class MyClass09 {
    void method1() {
        System.out.println("MyClass09.method1");
    }
}


class MySubClass091 extends MyClass09 {
    @Override
    void method1() {
        System.out.println("MySubClass091.method1");
    }
}