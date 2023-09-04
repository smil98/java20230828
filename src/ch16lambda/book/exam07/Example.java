package ch16lambda.book.exam07;

public class Example {
    private static int[] scores = {10, 50,3};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for(int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin( (x,y) -> {
            if(x > y) {
                return x;
            } else if (x < y) {
                return y;
            } else return x;
            //(x < y) ? y : x
        });
        System.out.println("max = " + max);

        int min = maxOrMin( (x,y) -> {
            if(x < y) {
                return x;
            } else if (x > y) {
                return y;
            } else return x;
            //(x < y) ? x : y
        });
        System.out.println("min = " + min);
    }
}
