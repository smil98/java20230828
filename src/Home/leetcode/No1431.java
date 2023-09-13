package Home.leetcode;

import java.util.Arrays;
import java.util.List;

public class No1431 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> answer = kidsWithCandies(candies, extraCandies);
        System.out.println(answer);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies)
                .max()
                .getAsInt();

        return Arrays.stream(candies)
                .map(x -> x+extraCandies)
                .mapToObj(c-> c>=max)
                .toList();
    }
}
