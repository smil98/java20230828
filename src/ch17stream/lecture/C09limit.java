package ch17stream.lecture;

import java.util.List;

public class C09limit {
    public static void main(String[] args) {
        var list = List.of(3,9,10,11,1,0,-3);
        list.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);
    }
}
