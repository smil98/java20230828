package ch11exception.book.exam09;

public class NoExistIDExecption extends Exception {
    public NoExistIDExecption() {}
    public NoExistIDExecption(String message) {
        super(message);
    }
}
