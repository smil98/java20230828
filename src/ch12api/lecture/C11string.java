package ch12api.lecture;

public class C11string {
    public static void main(String[] args) {
        String a = "java";
        String b = "java";
        String c = new String("java");

        //difference btw line 5 & 7
        System.out.println(a==b); //true
        System.out.println(a==c); //false
        System.out.println(a.equals(c)); //true


    }
}
