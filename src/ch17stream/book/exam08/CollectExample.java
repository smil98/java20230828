package ch17stream.book.exam08;

import ch17stream.book.exam05.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("김자바", "남", 95));
        totalList.add(new Student("오해영","여",93));

        Map<String, Double> map = totalList.stream()
                .collect(Collectors.groupingBy(
                                s -> s.getSex(),
                                Collectors.averagingDouble(s -> s.getScore())
                        )
                );

        map.entrySet().stream()
                        .forEach(x-> System.out.println(x.getKey() + ": " + x.getValue()));

        System.out.println(map);

    }
}
