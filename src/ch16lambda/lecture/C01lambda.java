package ch16lambda.lecture;

public class C01lambda {
    public static void main(String[] args) {
        MyInterface01 o1 = (x, y) -> {
            System.out.println(x+y);
        };

        MyInterface01 o2 = new MyInterface01() {
            @Override
            public void method(int x, int y) {
                System.out.println(x + y);
            }
        };
    }
}


//you can use lambda when you create instance of an interface with ONE SINGLE abstract method
interface MyInterface01 {
    void method(int x, int y);
}
