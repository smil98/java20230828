package ch11exception.lecture;

public class C06finally {
    public static void main(String[] args) {
        System.out.println("code1");

        try {
            int i = 0;
            int j = 3/i;
            System.out.println("code2");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.err.flush();
            System.out.flush();
            System.out.println("code3");
        } finally {
            //block that processes no matter if exception occurs
            System.out.println("MUST PRINT");
        }

        System.out.println("code4");
    }
}
