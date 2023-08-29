package ch06class;

public class C09static {
    public static void main(String[] args) {

    }
}

class MyClass09 {
    String name;
    static String model;

    //instance method
    void printName() {
        System.out.println("name = " + name);
        System.out.println("model = " + model);
    }

    static void printModel() {
        //static  member can access
        System.out.println("model = " + model);
        //instance member cannot access to static member
        //since static classifies method and field instance(specified object) can access but vice reversa cannot
        // System.out.println("name = " + name);
    }
}