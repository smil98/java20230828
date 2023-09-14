package ch11exception.lecture;

public class C23custom {
    public static void main(String[] args) {
        int money = 300;
        if(money < 10000) {
            throw new LackingMoneyException("No Money");
        }
    }
}

class LackingMoneyException extends RuntimeException {
    public LackingMoneyException() {

    }
    public LackingMoneyException(String message) {
        super(message);
    }
}