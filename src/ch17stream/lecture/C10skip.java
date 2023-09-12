package ch17stream.lecture;

import java.util.List;

public class C10skip {
    public static void main(String[] args) {
        var list = List.of(10, 9,1,2,5,3);
        list.stream()
                .skip(3)
                .forEach(System.out::println);
        System.out.println("min value");
        list.stream()
                .sorted()
                .limit(1)
                .forEach(System.out::println);
        System.out.println("max value");
        list.stream()
                .sorted()
                .skip(list.size()-1)
                .forEach(System.out::println);
        System.out.println("last element");
        list.stream()
                .skip(list.size()-1)
                .sorted()
                .forEach(System.out::println);
    }
}
