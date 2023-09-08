package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C07set {
    public static void main(String[] args) {
        //Set : collection that contains item, element
        //does NOT allow duplicate values, does not have index, does not keep sequence;

//        Set set1 = new Set<>; unable to create new interface
        Set<String> set1 = new HashSet<>();
        set1.add("java");
        set1.add("spring");
        set1.add("react");
        set1.add("java");

        System.out.println(set1.size());
        System.out.println(set1.contains("java"));
        System.out.println(set1.contains("html"));

        boolean remove1 = set1.remove("java");
        boolean remove2 = set1.remove("html");

        System.out.println(set1.size());
        System.out.println("remove1 = " + remove1);
        System.out.println("remove2 = " + remove2);

        //of: creates final object
        Set<String> set2 = Set.of("css", "react", "html");
//        set2.add("java");
        /*Exception in thread "main" java.lang.UnsupportedOperationException
	at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
	at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
	at ch15collection.lecture.C07set.main(C07set.java:31)*/

        //search
        //improved for
        for(String str : set2) {
            System.out.println(str);
        }

        //forEach
        set2.forEach(System.out::println);


    }
}
