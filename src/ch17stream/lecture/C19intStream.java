package ch17stream.lecture;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C19intStream {
    public static void main(String[] args) {
        //max
        OptionalInt max = IntStream.of(9,10,0,3,1,22,77,33)
                .max();
        System.out.println("max = " + max); //max = OptionalInt[77]
        max.ifPresent(value -> System.out.println("max = " + value)); //max = 77
        System.out.println("max = " + max.getAsInt());//max = 77

        int max2 = IntStream.of(9,10,0,3,1,22,77,33)
                .max()
                .getAsInt();
        System.out.println("max = " + max2);
        System.out.println();

        //min
        OptionalInt min = IntStream.of(9,10,0,3,1,22,77,33)
                .min();
        System.out.println("min = " + min);
        min.ifPresent(value -> System.out.println("min = " + value));
        System.out.println();
        //avg
        OptionalDouble avg = IntStream.of(9,10,0,3,1,22,77,33)
                .average();
        System.out.println("avg = " + avg);
        avg.ifPresent(value -> System.out.println("avg = " + value));
        System.out.println();
    }
}
