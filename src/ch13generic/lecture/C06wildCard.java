package ch13generic.lecture;

public class C06wildCard {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a1 = d;
        Cat c = new Cat();
        Animal a2 = c;

        MyClass06<Dog> o1 = new MyClass06<>();
//        MyClass06<Animal> o2 = o1;
//        o2.set(new Animal());
        //we cannot say All Animals are Dogs (since reference of instance MyClass06<Dog> is Dog)
        //thus o2.set(new Animal()); would be syntax error. To prevent this line 11 would not work
        MyClass06<? extends Animal> o3 = o1; //wild card
        Animal ani1 = o3.get(); //safer to recieve as Animal
//        o3.set(new Dog()); //not safe since Animal's sub class are mutiple, cannot ensure which one

        MyClass06<? extends Animal> o8 = new MyClass06<Cat>();
//        MyClass06<? extends Animal> o9 = new MyClass06<Object>();
        MyClass06<? super Animal> o4 = new MyClass06<Animal>();
        MyClass06<? super Animal> o5 = new MyClass06<Object>();
        MyClass06<? extends Animal> o7 = new MyClass06<Dog>();


        o4.set(new Dog());
        o5.set(new Dog());
        o4.set(new Cat());
        o4.set(new Animal());
    }
}

class Animal {
    public void animalMethod() {};
}

class Dog extends Animal {}

class Cat extends Animal {}

class MyClass06<T> {
    public void set(T param) {}
    public T get() {
        return null;
    }
}