package ch12api.lecture;

public class C16replace {
    public static void main(String[] args) {
        String a = "spring";
        String b = a.replace("sp", "abc");

        System.out.println(a);
        System.out.println(b);

        String c = "java is java";
        String d = c.replace("java", "python");
        System.out.println(d);

        String e = "JAVA is java";
        String f = e.replace("java", "html");
        System.out.println(f); //replace is case sensitive

    }
}
