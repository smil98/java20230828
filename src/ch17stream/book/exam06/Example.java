package ch17stream.book.exam06;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        System.out.println("[개발자]");
        Set<Member> developer = list.stream()
                .collect(Collectors.filtering(s -> s.getJob() == "개발자", Collectors.toSet()));
        System.out.println(developer);


        System.out.println();

        System.out.println("[디자이너]");
        Set<Member> designer = list.stream()
                .collect(Collectors.filtering(s -> s.getJob() == "디자이너", Collectors.toSet()));
        System.out.println(designer);


    }
}
