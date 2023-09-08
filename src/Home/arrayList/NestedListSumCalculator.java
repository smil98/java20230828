package Home.arrayList;

import java.util.ArrayList;
import java.util.List;

public class NestedListSumCalculator {
    public static void main(String[] args) {
        List<List<Integer>> nestedLists = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(10);
        list1.add(15);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);

        List<Integer> list3 = new ArrayList<>();
        list3.add(8);
        list3.add(12);
        list3.add(6);

        nestedLists.add(list1);
        nestedLists.add(list2);
        nestedLists.add(list3);

        // Your task: Use lambda expressions and forEach to calculate the sum of each inner list
        // and print the sums.

        nestedLists.forEach(subList -> {
            final int[] sum = {0};
            subList.forEach(element -> sum[0] += element);
            System.out.println(sum[0]);
        });
        // Your code goes here

    }
}
