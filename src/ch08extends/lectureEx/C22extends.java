package ch08extends.lectureEx;

public class C22extends {
    public static void main(String[] args) {
        MySubClass221 o1 = new MySubClass221();
        /* When instance o1 is created, MySubClass221 inherits MyClass22
        * !important! constructor of super class must be called beforehand
        * hence add super(); to do this
        * if no constructor is defined, compiler does it automatically
        * */
    }
}

class MyClass22 {
    MyClass22() {
        // initializing code for instance field MyClass22
        System.out.println("상위 클래스 초기화 코드");
    }
}

class MySubClass221 extends MyClass22 {
    MySubClass221() {
        //initializes instance field of MySubClass221
        super(); //goes to MyClass22 and calls constructor
        System.out.println("하위 클래스 초기화 코드");
    }
}
