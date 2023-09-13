package Home.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddingDouble {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        int result = sumOfDoubled(nums);
        System.out.println(result);
    }
    
    public static int sumOfDoubled(int[] nums) {
        Map<Integer, Long> frequency = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                );

        int sumOfDouble = frequency.entrySet().stream()
                .filter(x -> x.getValue() == 2)
                .mapToInt(x -> x.getKey()*2)
                .sum();

        return sumOfDouble;
    }
}
