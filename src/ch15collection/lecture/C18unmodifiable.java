package ch15collection.lecture;

import java.util.Map;

public class C18unmodifiable {
    public static void main(String[] args) {
        Map<String, String> map = Map.of(
                "num1", "hm",
                "num2", "hm2",
                "num3", "hm3");

        System.out.println(map);
    }
}
