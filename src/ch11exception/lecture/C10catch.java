package ch11exception.lecture;

public class C10catch {
    public static void main(String[] args) {
        try {
            //exception code
        } catch (ArrayIndexOutOfBoundsException e) {
            //a
        } catch (NumberFormatException e) {
            //b
        }
        //if code a, b are equivalent

        try {

        } catch(NullPointerException | ClassCastException e) {

        }

    }
}
