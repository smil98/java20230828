package ch13generic.lecture;

public class C02generic {
    public static void main(String[] args) {
        MyClass02<Object> o1 = new MyClass02<Object>();
        MyClass02<String> o2 = new MyClass02<String>();
        MyClass02<Integer> o3 = new MyClass02<Integer>();
        MyClass02<Boolean> o4 = new MyClass02<Boolean>();
        //only allows reference types inside type parameter

        MyClass02<Object> o6 = new MyClass02<>(); //can omit to this form
    }
}

//<T> = type parameter
class MyClass02<T> {
//    private Object a; would switch to:
    private T a;

    public void setA(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }
}