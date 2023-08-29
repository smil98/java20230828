package ch08extends.lectureEx;

public class C12polymorphism {
    public static void main(String[] args) {
        Malamute12 dog = new Malamute12();
        dog.breathe();
        dog.sniff();

        Animal12 ani = dog;
        ani.breathe();
//        ani.sniff(); error!

        Animal12 ani2 = new Malamute12();
        ani.breathe();
//        ani2.sniff(); error!


    }
}

class Animal12 {
    public void breathe() {
        System.out.println("숨쉬다");
    }

}

class Malamute12 extends Animal12 {
    public void sniff() {
        System.out.println("냄새를 맡다");
    }
}