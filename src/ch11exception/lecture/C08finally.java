package ch11exception.lecture;

public class C08finally {
    public static void main(String[] args) {
        try {
            System.out.println("code processed");
            return;
        } finally {
            System.out.println("must process this");
        }
    }
}
