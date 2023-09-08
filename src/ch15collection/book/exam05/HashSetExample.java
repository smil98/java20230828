package ch15collection.book.exam05;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        Iterator<String> iterator = set.iterator();
        //allows the caller to remove elements from the underlying collection
        //hasNext() -> if there are more elements, returns true
        //next() -> returns the next element in the iteration
        //remove -> removes from the underlying collection the last element that it brought
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println( element);
            if(element.equals("JSP")) {
                iterator.remove();
            }
        }
        System.out.println();

        set.remove("JDBC");
        for(String element : set) {
            System.out.println(element);
        }
    }
}
