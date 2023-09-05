package ch12api.lecture;

public class C12string {
    public static void main(String[] args) {
        String a = "java";
        String b = "spring";
        String c = "hello World";
        String d = "hi java  ";

        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(c.length());
        System.out.println(d.length());

        //text block

        String e = """
                hello World!
                hi java
                for god's sake
                time is money
                """;

        System.out.println(e.length());
        //includes enter but drops left indent
        //null spaces are included
    }
}
