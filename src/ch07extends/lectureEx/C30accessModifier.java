package ch07extends.lectureEx;

public class C30accessModifier {
    public static void main(String[] args) {
        //access modifier
        //public, protected, (package private, default), private

        //public : grants access to all
        //private : grants minimal access (amongst that class only)
        //protected : grants access to same package, and classes in other package that has inherited
        //package private, default : only amongst same class
        //!IMPORTANT! there cannot be two or more public class in one file
        MyClass30 o1 = new MyClass30();
        o1.publicMethod();
//        o1.privateMethod(); error!
        o1.packagePrivateMethod();
        o1.protectedMethod();

    }
}
