package ch17stream.book.exam03;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        var list = List.of(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("김자바", 26)
        );

        list.stream()
                .map(x -> x.getAge())
                .forEach(System.out::println);

        Integer ageSum = list.stream()
                .map(x->x.getAge())
                .reduce(0, (x,y)->x+y);
        //reduce(0, Integer::sum)
        System.out.println(ageSum);

        //max age

        Integer maxAge = list.stream()
                .map(x->x.getAge())
                .reduce(0, Math::max);
        System.out.println(maxAge);

        //min age
        Integer minAge = list.stream()
                .map(x->x.getAge())
                .reduce(Integer.MAX_VALUE, Math::min);
        System.out.println(minAge);
    }
}
