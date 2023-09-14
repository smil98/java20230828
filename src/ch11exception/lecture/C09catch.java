package ch11exception.lecture;

public class C09catch {
    public static void main(String[] args) {
        try {
            int[] arr = {1,0};
            int i = 3 / arr[1]; //if more than one exception may occur
        } catch (ArithmeticException e) {
            System.out.println("Wrong Operation");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong Index Reference");
        }
        //create mutiple catch blocks in advance
    }
}
