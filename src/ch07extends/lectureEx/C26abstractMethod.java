package ch07extends.lectureEx;

public class C26abstractMethod {
    public static void main(String[] args) {
        Dog26 d1 = new Dog26();
        d1.breathe();

        Animal26 a1 = d1;
        a1.breathe();

        Fish26 f1 = new Fish26();
        f1.breathe();
    }
}

abstract class Animal26 {
    //abstract method : method without any specification
    //class with abstract method must be abstract class itself
    abstract public void breathe();
}

class Dog26 extends Animal26 {
    //must override abstract method to remain as instance
    @Override
    public void breathe() {
        System.out.println("폐로 숨을 쉽니다.");
    }
}

class Fish26 extends Animal26 {
    @Override
    public void breathe() {
        System.out.println("아가미로 숨을 쉽니다.");
    }
}