package Home.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddingOddFreq {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 2, 1};
        int result1 = sumOfOddOccurrence(nums1); // Output: 3 (3 occurs once, and 1 occurs twice, so the sum is 3)

        int[] nums2 = {4, 5, 6, 7, 4, 5};
        int result2 = sumOfOddOccurrence(nums2); // Output: 6 (6 and 7 occur once, so their sum is 13, but 13 is even, so we return 6)

        int[] nums3 = {1, 2, 3, 4, 5};
        int result3 = sumOfOddOccurrence(nums3); // Output: 15 (All elements occur once, so the sum is 15)

        int[] nums4 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7};
        int result4 = sumOfOddOccurrence(nums4); // Output: 0 (All elements occur twice, so the sum is 0)

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
    }

    public static int sumOfOddOccurrence(int[] nums) {
        Map<Integer, Long> frequency = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                );

        return frequency.entrySet().stream()
                .filter(x->x.getValue() % 2 !=0)
                .mapToInt(x->x.getKey())
                .sum();
    }
}
