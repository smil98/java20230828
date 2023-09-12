package ch17stream.lecture;

import java.util.List;

public class C11sorted {
    public static void main(String[] args) {
        var list = List.of(10,35,1,5,7,9);

        //reversed and prints MAX
        list.stream()
                .sorted((x,y) -> y-x)
                .limit(1)
                .forEach(System.out::println);

        //prints min
        list.stream()
                .sorted()
                .limit(1)
                .forEach(System.out::println);
    }
}
