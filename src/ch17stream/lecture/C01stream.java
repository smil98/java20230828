package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C01stream {
    public static void main(String[] args) {
        List<String> list = List.of("java", "spring", "css", "react");
        for(String item : list) {
            System.out.println("item = " + item);
        }

        //stream
        Stream<String> stream = list.stream();

        //method
        //intermediate operation : can continuously use throughout
        stream.limit(5);
        //terminal operation : can only use once, finishes all intermediate operation together
        //cannot use stream after terminal operation
        stream.count();




    }
}
