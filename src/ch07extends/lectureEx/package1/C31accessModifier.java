package ch07extends.lectureEx.package1;

import ch07extends.lectureEx.MyClass30;

public class C31accessModifier {
    public static void main(String[] args) {
        MyClass30 o1 = new MyClass30();

//        o1.privateMethod(); error
        o1.publicMethod();
//        o1.packagePrivateMethod(); error
//        o1.protectedMethod(); error
    }
}
