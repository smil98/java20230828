package ch15collection.lecture;

import java.util.*;

public class C13map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("학생1", "흥민");
        map.put("학생2", "강인");
        map.put("학생3", "민재");

        //improved for
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println();

        //keySet
        System.out.println("Using keySet");
        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key+ ":"+ map.get(key));
        }
        System.out.println();

        //forEach
        System.out.println("Using forEach");
        map.forEach((x,y) -> System.out.println(x+":"+y));

    }
}
