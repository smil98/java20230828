package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;

public class C12map {
    public static void main(String[] args) {
        //Map : saves key and value
        //there cannot be duplicate keys

        Map<String, String> map = new HashMap<>();
        //adding entry method
        map.put("student1", "손흥민");
        map.put("student2", "이강인");
        map.put("student3", "김민재");

        //deleting entry method
        map.remove("student3", "김민재");
        //can delete just by key
        map.remove("student1");

        //changing entry method
        map.put("student2", "박지성"); //if exist change, if not adds

        //getting entry value method
        String s = map.get("student2");
        System.out.println("s = " + s);

        //finding how many entries
        System.out.println("map.size() = " + map.size());
    }
}
