package ch07extends.lectureEx;

public class C21constructor {
    //class : consists field, method, and constructor
    public static void main(String[] args) {
        MyClass21 o1 = new MyClass21(40);
        o1.printAge();

        MyClass21 o2 = new MyClass21(50);
        o2.printAge();
        o1.printAge(); //still has 40 as age


    }

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

