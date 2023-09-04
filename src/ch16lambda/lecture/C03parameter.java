package ch16lambda.lecture;

public class C03parameter {
    public static void main(String[] args) {
        MyInterface03 o1 = (int x, int y) -> {
            /*body*/
        };

        MyInterface03 o2 = (x, y) -> {
            /*body*/
        };
    }
}

interface MyInterface03 {
    void method(int x, int y);
}