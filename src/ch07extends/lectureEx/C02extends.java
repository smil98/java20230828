package ch07extends.lectureEx;

public class C02extends {
    public static void main(String[] args) {
        MySubClass021 o1 = new MySubClass021();
        o1.name = "spring";
        o1.method3();
    }
}

class MySubClass021 extends MyClass02 {
    //MyClass02 - super, parent Class
    //MySubClass021 - sub, child Class
}

class MyClass02 {
    String name;
    public void method3() {
        System.out.println("name = " + name);
    }
}