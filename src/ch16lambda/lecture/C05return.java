package ch16lambda.lecture;

public class C05return {
    public static void main(String[] args) {
        MyInterface05 o1 = () -> {
            return 0;
        };

        MyInterface05 o2 = () -> 0; //can simplify like this
    }
}

@FunctionalInterface
interface MyInterface05 {
    int method();
}

class MyClass05 implements MyInterface05 {
    @Override
    public int method() {
        return 1;
    }
}