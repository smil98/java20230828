package Home.leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class No1512 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int answer = numIdenticalPairs(nums);

        System.out.println(answer);

    }

    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Long> pairs = Arrays.stream(nums)
                .boxed() //converts reference type array to primitive int
                .collect(Collectors.groupingBy(
                                e -> e, //same as Function.identity()
                                Collectors.counting()
                        )
                );

        return (int) pairs.values().stream()
                .mapToLong(count -> (count * (count - 1)) / 2)
                .sum();
        //can also work if you add .mapToInt(n-> n.intValue())
    }
}