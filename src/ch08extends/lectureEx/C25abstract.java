package ch08extends.lectureEx;

public class C25abstract {
    public static void main(String[] args) {
        Dog25 d1 = new Dog25();
        Cat25 c1 = new Cat25();

        Animal25 a1 = d1;
        Animal25 a2 = c1;

//        Animal25 a3 = new Animal25(); due to abstract, this cannot be done
    }
}

//추상클래스
//prevents from creating instance
abstract class Animal25 {

}

class Dog25 extends Animal25 {

}

class Cat25 extends Animal25 {

}