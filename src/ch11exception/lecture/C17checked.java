package ch11exception.lecture;

public class C17checked {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
