package ch08extends.lectureEx;

public class C21constructor {
    //class : consists field, method, and constructor


}

class MyClass21 {
    private int age; //field

    MyClass21(int age) { //constructor
        this.age = age;
    }
    public void printAge() { //method
        System.out.println("age = " + age);
    }
}

