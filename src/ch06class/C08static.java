package ch06class;

public class C08static {
    public static void main(String[] args) {
        MyClass08 o1 = new MyClass08();

        MyClass08.name = "java";
        o1.printName();
    }
}

class MyClass08 {
    static String name;
    static void printName() {
        System.out.println("name = " + name);
    }
}