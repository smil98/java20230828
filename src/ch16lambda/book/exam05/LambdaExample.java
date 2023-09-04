package ch16lambda.book.exam05;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        //if method is longer than one line
        person.action((x,y) -> {
            double result = x + y;
            return result;
        });

        //if return has one single line, simplify as:
        person.action((x,y) -> (x+y));
        person.action((x,y) -> sum(x,y));
    }

    public static double sum(double x, double y) {
        return (x+y);
    }
}
