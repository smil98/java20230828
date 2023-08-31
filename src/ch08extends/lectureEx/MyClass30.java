package ch08extends.lectureEx;

public class MyClass30 {
    private void privateMethod() {
        System.out.println("MyClass30.privateMethod");
    }

    public void publicMethod() {
        System.out.println("MyClass30.publicMethod");
        privateMethod(); //can access to private(field, method, constructor) since in same class
    }

    void packagePrivateMethod() {
        System.out.println("MyClass30.packagePrivateMethod");
    }

    protected void protectedMethod() {
        System.out.println("MyClass30.protectedMethod");
    }
}
