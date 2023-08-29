package ch06class;

public class C07method {
    public static void main(String[] args) {
        MyClass07 o1 = new MyClass07();
        MyClass07 o2 = new MyClass07();

        o1.myMethod1();
        o2.myMethod1();

        o1.name = "java";
        o2.name = "spring";

        o1.printName();
        o2.printName();

        MyClass07.model = "blahblah";

        o1.printModel();
        o2.printModel();

    }
}


class MyClass07 {
    //field
    String name;
    static String model;

    //method
    void printName() {
        System.out.println("name = " + name);
    }
    void printModel() {
        System.out.println("model = " + model);
    }
    void myMethod1() {
        System.out.println("myMethod1 실행");
        System.out.println("MyClass07.myMethod1"); //soutm
    }
}