package ch11exception.book.exam02;

public class ExceptionHandlingExample2 {
    public static void printLength(String data) {
        try{
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("last clean up");
        }
    }
    public static void main(String[] args) {
        System.out.println("program starts");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("program finished");
    }
}
