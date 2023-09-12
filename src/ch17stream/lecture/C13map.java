package ch17stream.lecture;

import java.util.List;

public class C13map {
    public static void main(String[] args) {
        var list = List.of(3,1,2,5,7);

        list.stream()
                .map(x->10) //replacing orig value with 10, but not changing the list itself
                .forEach(System.out::println);

        System.out.println();

        System.out.println("replacing as negative");
        list.stream()
                .map(x-> -x)
                .forEach(System.out::println);

        System.out.println();

        System.out.println("doubling the values");
        list.stream()
                .map(x -> 2*x)
                .forEach(System.out::println);

        System.out.println();

        System.out.println("x^2");
        list.stream()
                .map(x -> x*x)
                .forEach(System.out::println);
    }
}
