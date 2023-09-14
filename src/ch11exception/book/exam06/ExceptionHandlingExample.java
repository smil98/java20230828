package ch11exception.book.exam06;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for(int i = 0; i <= array.length;i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index is out of Bounds: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Problems with Processing");
            }
        }
    }
}
