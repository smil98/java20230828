package ch11exception.book.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};
        for(int i = 0; i<= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]:" + value);
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index Over Limit: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Cannot Convert to Integer: " + e.getMessage());
            }
        }
    }
}
