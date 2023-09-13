package Home.leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class No1748 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums) {
        /*
        Map<Integer, Long> occurance = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                );
        int sum = occurance.entrySet().stream()
                .filter(count -> count.getValue() == 1)
                .mapToInt(n -> n.getKey())
                .sum();*/


        return Arrays.stream(nums)
                .filter(num -> Arrays.stream(nums).
                        filter(n-> n==num).count()==1
                )
                .distinct()
                .sum();

//        return sum;
    }
}