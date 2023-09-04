package ch16lambda.lecture;

import java.util.Arrays;
import java.util.List;

public class C04parameter {
    public static void main(String[] args) {
        MyInterface04 o1 = (x) -> {
            /*body*/
        };
        MyInterface04 o2 = x -> {}; //can simplify if there is one single parameter

        List<String> list = List.of("java", "spring", "css", "html");
        list.forEach(e -> System.out.println(e)); //don't have to use for inorder to print
        //examples of usage
        int[] arr = {10,20,30,40,50,60,70};
        Arrays.stream(arr).forEach(e -> System.out.println(e));
        System.out.println();
        Arrays.stream(arr).forEach(System.out::println);

    }
}

interface MyInterface04 {
    void method(int x);
}