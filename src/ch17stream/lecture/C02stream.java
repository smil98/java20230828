package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C02stream {
    public static void main(String[] args) {
        List<String> list = List.of("ab", "de", "xy");
//        Stream<String> stream = list.stream();
//        Stream<String> stream1 = stream.map(e -> e + e);
//        long count = stream1.count();

        list.stream()
                .map(e->e+e)
                .filter(e->e.length() >1)
                .count(); //place terminal operation at the end
        //preferred syntax

    }
}
