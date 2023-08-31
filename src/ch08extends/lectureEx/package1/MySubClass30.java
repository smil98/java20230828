package ch08extends.lectureEx.package1;

import ch08extends.lectureEx.MyClass30;

public class MySubClass30 extends MyClass30 {
    public void someMethod() {
        super.publicMethod();
        super.protectedMethod();
//        super.packagePrivateMethod();
//        super.privateMethod();
    }
}
