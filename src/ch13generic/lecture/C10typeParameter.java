package ch13generic.lecture;

public class C10typeParameter {
    public static void main(String[] args) {
        MyClass10<Animal> o1 = new MyClass10<Animal>();
        MyClass10<Dog> o2 = new MyClass10<>();
        MyClass10<Cat> o3 = new MyClass10<>();
    }
}

class MyClass10<T extends Animal> {
    public void method(T param) {
        param.equals(null);
        param.toString();
        param.hashCode();
        param.animalMethod();
    }
}