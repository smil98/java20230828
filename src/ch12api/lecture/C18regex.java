package ch12api.lecture;

public class C18regex {
    public static void main(String[] args) {
        System.out.println("x".matches("x"));
        System.out.println("a".matches("a"));
        System.out.println("a".matches("x"));

        System.out.println("xyz".matches("xyz"));
        System.out.println("xxx".matches("xxx"));
        System.out.println("xxx".matches("x")); //f

        //quantifiers
        System.out.println("xxx".matches("x{3}"));
        System.out.println("aaa".matches("a{2}")); //f
        System.out.println("aaa".matches("a{1,3}")); //t
        System.out.println("aa".matches("a{1,3}"));
        System.out.println("a".matches("a{1,3}"));

        System.out.println("dog".matches("do{1,3}g"));
        System.out.println("dooog".matches("do{1,3}g"));
        System.out.println("doog".matches("do{1,3}g"));
    }
}
