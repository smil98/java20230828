package ch11exception.lecture;

public class C05printStackTrace {
    public static void main(String[] args) {
        System.out.println("code1");

        try {
            int i =0;
            int j = 3/i; //result error so bottom code wont be processed
            System.out.println("code2");
        } catch(ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("code3");
    }
}
