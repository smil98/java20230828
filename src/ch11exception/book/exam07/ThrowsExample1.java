package ch11exception.book.exam07;

public class ThrowsExample1 {
    public static void main(String[] args) {
        try {
            findClass();
        } catch(ClassNotFoundException e) {
            System.out.println("Exception: " + e.toString());
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
