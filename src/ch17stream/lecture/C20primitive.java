package ch17stream.lecture;

import java.util.stream.IntStream;

public class C20primitive {
    public static void main(String[] args) {
        //primitive stream : IntStream, LongStream, DoubleStream
        //reference stream : Stream<T>
        Integer max = IntStream.of(3,9,1,2,7)
                .boxed()
                .max(Math::max)
                .get();

        System.out.println("max = " + max);
    }
}
