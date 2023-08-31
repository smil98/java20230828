package ch07extends.lectureEx;

public class C24constructor {
    public static void main(String[] args) {

    }
}


class MyClass24 {
    int age;

    //if constructor with parameter is created, basic constructor is NOT automatically added
    MyClass24(int age) {
        this.age = age;
    }
}

class MySubClass241 extends MyClass24 {
    MySubClass241() {
//        super(); line 13
        //Since MyClass24 does not have basic constructor(w/o parameter) error
        super(30); //thus give parameter to super() or add basic constructor to parent
    }
}