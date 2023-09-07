package ch13generic.lecture;

import java.util.HashMap;

public class C05generic {
    public static void main(String[] args) {
        MyClass05<Integer, String> o1 = new MyClass05<>();
        MyClass05<Integer, String> o2 = new MyClass05<>();
        HashMap<String, Integer> map = new HashMap<>();
    }
}

class MyClass05<T, U> {
    private T field;
    private U field2;

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    public U getField2() {
        return field2;
    }

    public void setField2(U field2) {
        this.field2 = field2;
    }
}