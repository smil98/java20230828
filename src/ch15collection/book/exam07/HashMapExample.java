package ch15collection.book.exam07;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);

        System.out.println("총 엔트리 수: " + map.size());
        System.out.println();

        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key + ": " + value);
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + ": " + v);
        }
        System.out.println(); //using keySet + iterator


        map.forEach((key1, value1) -> System.out.println(key1+ ":" + value1)); //using forEach by lambda
        System.out.println();

        Set<Entry<String, Integer>> entrySet = map.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println();


        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();

        while(entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + ": " + v);
        }
        System.out.println();

        map.remove("홍길동");
        System.out.println("총 엔트리 수 : " + map.size());
        System.out.println();
    }
}
