package ch16lambda.book.exam09;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.ordering(String::compareToIgnoreCase);
    }
}
