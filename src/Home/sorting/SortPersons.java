package Home.sorting;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class SortPersons {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 30));
        persons.add(new Person("Bob", 25));
        persons.add(new Person("Charlie", 35));
        persons.add(new Person("David", 22));

        // Write code here to sort the 'persons' list based on their ages in ascending order using a custom comparator.
        Collections.sort(persons, (x, y) -> Integer.compare(x.getAge(), y.getAge()));


        // Print the sorted list of persons.
        System.out.println(persons);
    }
}
