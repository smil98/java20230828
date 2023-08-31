package ch07extends.lectureEx;

public class C15cast {
    public static void main(String[] args) {
        Animal15 ani1 = new Dog15();
        Animal15 ani2 = new Cat15();

        Dog15 d1 = (Dog15) ani1; // possible
        Cat15 c1 = (Cat15) ani2; // possible

        Cat15 c2 = (Cat15) ani1; //Syntax Error -> CastingException
        //since in line 5 ani1 has reference address of Dog15 cannot be casted as Cat15
        //so when casting must consider deeply

        System.out.println("program continues...");
    }
}

class Animal15 {

}

class Dog15 extends Animal15 {

}

class Cat15 extends Animal15 {

}