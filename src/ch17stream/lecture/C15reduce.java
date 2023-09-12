package ch17stream.lecture;
import java.util.List;

public class C15reduce {
    public static void main(String[] args) {
        var list = List.of(5,1,3);

        Integer reduce = list.stream()
                .reduce(0, (r,e) -> 0);

        System.out.println("reduce = " + reduce);

        System.out.println("total sum");
        Integer sum = list.stream()
                .reduce(0, (r,e) -> r+e);
        System.out.println(sum);
        //identity of reduce is the initial value
        //reduce squishes every element into one

//        apply(0,5);
//        apply(0,1);
//        apply(0,3);

        System.out.println("max value");
        Integer max = list.stream()
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("max = " + max);

        System.out.println("min value");
        Integer min = list.stream()
                .reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("min = " + min);

        var list2 = List.of("ja", "va ", "is ", "g", "ood");
        String sentence = list2.stream()
                .reduce("", String::concat);
        System.out.println(sentence);


    }
}
