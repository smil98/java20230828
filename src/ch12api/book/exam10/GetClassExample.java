package ch12api.book.exam10;

public class GetClassExample {
    public static void main(String[] args) {
        Class c1 = Car.class;
        System.out.println("package: " + c1.getPackage().getName());
        System.out.println("class simple name: " + c1.getSimpleName());
        System.out.println("class name: " + c1.getName());

    }
}

class Car {
}