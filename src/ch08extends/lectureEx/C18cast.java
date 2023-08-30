package ch08extends.lectureEx;

public class C18cast {
    public static void main(String[] args) {
        Animal18 ani1 = new Dog18();
        Animal18 ani2 = new Cat18();

        if(ani1 instanceof Dog18 d1) { //can concise like this
            d1.bark();
        } else {
            System.out.println("cannot cast as Dog17");
        }

        if(ani2 instanceof Cat18 c1) {
            c1.meow();
        } else {
            System.out.println("cannot cast as Cat17");
        }

        if(ani1 instanceof Cat18 c2) {
            c2.meow();
        } else {
            System.out.println("cannot cast as Cat17");
        }
    }
}

class Animal18 {

}

class Dog18 extends Animal18 {
    public void bark() {
        System.out.println("woof woof");
    }
}

class Cat18 extends Animal18 {

    public void meow() {
        System.out.println("meow");
    }
}