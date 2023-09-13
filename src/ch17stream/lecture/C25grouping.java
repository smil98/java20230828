package ch17stream.lecture;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;

public class C25grouping {
    public static void main(String[] args) {
        List<String> list = List.of(
                "java",
                "spring",
                "css",
                "html",
                "react",
                "vue",
                "jquery",
                "jsp");

        Map<Integer, Long> stringLength = list.stream()
                .collect(groupingBy(String::length, counting()));

        stringLength.entrySet()
                .stream()
                .forEach(e-> System.out.println(e.getKey() + ": "+ e.getValue()));

    }
}
