package ch13generic.lecture;

public class C03typeParameter {
    public static void main(String[] args) {
        MyClass03<Integer> o1 = new MyClass03<>();
    }
}

//type parameter naming conventions
/*
    Use only one Uppercase alphabet
    T: type
    V: value
    N: number
    K: key
    E: element
    S, U, T1, T2: etc
*/
class MyClass03<T> {
    private T a;

}