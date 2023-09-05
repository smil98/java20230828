package ch16lambda.lecture;

import java.util.stream.IntStream;

public class C12constructorReference {
    public static void main(String[] args) {
        for(int i = 1; i< 10; i++) {
            Student s = new Student(i);
            System.out.println(s);
        } //classic method for creating 9 students

        //can write as this:
        System.out.println("Using Stream");
        IntStream.range(1,10)
                .mapToObj(Student::new)
                .forEach(System.out::println);
    }
}

class Student {
    private int number;
    Student(int number) {
        this.number = number;
    }
//alt insert -> toString
    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                '}';
    }
}

