package ch13generic.book.exam02;

import java.awt.*;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<String>();
        container1.set("홍길동");
        String str = container1.get();

        Container<Integer> container2 = new Container();
        container2.set(6);
        int value = container2.get();
    }
}

class Container<T> {
    private T a;

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }
}
