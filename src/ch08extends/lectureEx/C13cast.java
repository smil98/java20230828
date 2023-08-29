package ch08extends.lectureEx;

public class C13cast {
    public static void main(String[] args) {
        Animal13 ani1 = new Dog13();
        Animal13 ani2 = new Cat13();

        ani1.breathe();
        ani2.breathe();

//        ani1.sniff(); error!

        Dog13 d1 = (Dog13) ani1; //similar to (int)3.13
        d1.sniff(); //this is called casting
        Cat13 c1 = (Cat13) ani2; //changing reference type from ani to cat
        c1.hunt(); //since reference type are equivalent no prob
    }
}

class Animal13 {
    public void breathe() {
        System.out.println("inhale exhale");
    }
}

class Dog13 extends Animal13 {

    public void sniff() {
        System.out.println("senses smell");
    }
}

class Cat13 extends Animal13 {
    public void hunt() {
        System.out.println("caught a rat");
    }
}