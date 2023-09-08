package ch15collection.lecture;

import java.util.List;
import java.util.ArrayList;

public class C06nestedList {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        List<Integer> row2 = new ArrayList<>();

        row1.add(9);
        row1.add(7);
        row1.add(5);

        row2.add(10);
        row2.add(20);

        list.add(row1);
        list.add(row2);

        list.forEach( innerList -> {
            innerList.forEach(element -> {
                System.out.println(element);
            });
        });
    }
}
