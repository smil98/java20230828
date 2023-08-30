package ch08extends.lectureEx;

public class C14type {
    public static void main(String[] args) {
        int a = 3; //primitive
        double f = 3.0;
        double g = 30;
        String b = "java"; //reference

        Object o = "java";

        Child c = new Child();
        Parent d = new Child();


    }
}

class Parent {

}

class Child extends Parent {

}