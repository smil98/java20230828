package ch12api.lecture;

import java.util.Arrays;

public class C25arrays {
    public static void main(String[] args) {
        Student[] arr22 = {
                new Student("이강인"),
                new Student("손흥민"),
                new Student("김민재")
        };

        Arrays.sort(arr22, (x, y) -> x.getName().compareTo(y.getName())); //never specified comparing method;
        //classcastingexception
        System.out.println(Arrays.toString(arr22));
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}