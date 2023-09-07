package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class C04forEach {
    public static void main(String[] args) {
        List<MyClass04> list = new ArrayList<>();
        list.add(new MyClass04("흥민"));
        list.add(new MyClass04("강인"));
        list.add(new MyClass04("민재"));

        list.forEach(System.out::println);
    }
}

class MyClass04 {
    private String name;

    public MyClass04(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyClass04 myClass04 = (MyClass04) o;

        return Objects.equals(name, myClass04.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}