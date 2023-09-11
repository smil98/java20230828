package ch15collection.lecture;
import java.util.*;

public class C09iterator {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("java");
        set.add("css");
        set.add("spring");
        set.add("jsp");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("item = " + item);
            iterator.remove();
        }

        System.out.println("set.size() = " + set.size());
    }
}
