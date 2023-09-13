package ch17stream.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class C23collect {
    public static void main(String[] args) {
        List<String> list = List.of("java", "spring", "css", "html");

        //classic
        List<Integer> res1 = new ArrayList<>();
        for(String str : list) {
            res1.add(str.length());
        }
        System.out.println("res1 = " + res1);
        System.out.println();

        List<Integer> res2 = list.stream()
                .map(String::length)
                .collect(toList());
        System.out.println("res2 = " + res2);
        System.out.println();

        Set<Integer> res3 = list.stream()
                .map(String::length)
                .collect(toSet());
        System.out.println("res3 = " + res3);
        //collect : terminal operator
        System.out.println();

        Map<String, Integer> collect = list.stream()
                .collect(toMap(x -> x, String::length));
        System.out.println(collect);

        Map<String, Integer> collect1 = list.stream()
                .collect(toMap(Function.identity(), String::length));
        System.out.println("collect1 = " + collect1);

    }
}
