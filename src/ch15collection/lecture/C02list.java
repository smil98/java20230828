package ch15collection.lecture;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class C02list {
    public static void main(String[] args) {
        //List: ordered, can add duplicate values
        List<String> list = new ArrayList<>();
        
        /* Adding Elements */
        list.add("java");
        list.add("spring");
        list.add("css");
        list.add("react");

        //taking out elements
        String s = list.get(0);
        String t = list.get(3);
        System.out.println(s);
        System.out.println(t);

        /* Counting */
        int size = list.size();
        System.out.println("size = " + size);
        
        list.add("react");
        list.add("css");
        
        size = list.size();
        System.out.println("size = " + size);

        //Delete elements
        list.remove("react"); //deletes first occurance
        System.out.println(list.size());
        list.remove("java");
        System.out.println(list.size());

        System.out.println(list.get(0));
        System.out.println(list.get(3));

        boolean contains1 = list.contains("java");
        System.out.println("contains1 = " + contains1);
        boolean contains2  = list.contains("react");
        System.out.println("contains2 = " + contains2);

        //for
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //improved for
        for(String item : list) {
            System.out.println(item);
        }

        list.forEach(x -> System.out.println(x));
        //can shrink to
        list.forEach(System.out::println);
    }
}
