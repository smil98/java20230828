package Home.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SingleElement {
    public static void main(String[] args) {
        int[] nums = {2,2,3,2};

        int result = findSingleElement(nums);
        System.out.println("result = " + result);
    }
    public static int findSingleElement(int[] nums) {
        // Your code here

        Map<Integer, Long> frequency = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                );

        return frequency.entrySet().stream()
                .filter(x-> x.getValue() == 1)
                .mapToInt(x->x.getKey())
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("No single element was found"));
    }

}
