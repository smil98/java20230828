package ch08interface.lecture;

public class C14staticMethod {
    public static void main(String[] args) {
        MyInterface14.method1(); //public static method
        //don't have to create instance to process static method
    }
}

interface MyInterface14 {
    // field : public static final
    //instance method :
    // abstract
    // default
    // private

    static void method1() {
        //automatically public
        System.out.println("MyInterface14.method");
        common();
    }

    static void method2() {
        System.out.println("MyInterface14.method");
        common();
    }

    private static void common() {
        System.out.println("어떤 기능1");
    } //compatiable way to decrease same code but preventing usage from other class/interface

}

