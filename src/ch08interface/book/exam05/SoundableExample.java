package ch08interface.book.exam05;

public class SoundableExample {
    public static void printSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }
    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }
}

class Dog implements Soundable {
    @Override
    public String sound() {
        return "멍멍";
    }
}

class Cat implements Soundable {
    @Override
    public String sound() {
        return "야옹";
    }
}
