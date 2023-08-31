package ch07extends.bookEx.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        //method3() error

        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();

    }
}
