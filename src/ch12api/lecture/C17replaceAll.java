package ch12api.lecture;

public class C17replaceAll {
    public static void main(String[] args) {
        //replaceAll : replaces specified pattern to another string
        String a = "JAVA is java";
        String r = a.replace("java", "python");
        System.out.println(r);

        String r2 = a.replaceAll( "(java|JAVA)", "python");
        System.out.println(r2);
    }
}
