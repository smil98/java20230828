package ch08extends.lectureEx;

public class C10polymorphism {
    public static void main(String[] args) {

//        Animal10 dog1 = new Malamute10();
        Malamute10 dog1 = new Malamute10();
        Chiwawa dog2 = new Chiwawa();

        Canidae10 can1 = dog1;
        Canidae10 can2 = dog2;

        Animal10 ani1 = dog1;
        Animal10 ani2 = dog2;

        dog1.breathe();
        dog2.breathe();
        can1.breathe();
        can2.breathe();

        dog1.howl();
        dog2.howl();
        can1.howl();
        can2.howl();
    }
}

class Animal10 {

    public void breathe() {
        System.out.println("inhale, exhale");
    }

    public void howl() {
        System.out.println("woof woof");
    }
}

class Canidae10 extends Animal10 {

}

class Malamute10 extends Canidae10 {
    @Override
    public void howl() {
        System.out.println("왕왕");
    }
}

class Chiwawa extends Canidae10 {
    @Override
    public void howl() {
        System.out.println("왈왈");
    }
}
