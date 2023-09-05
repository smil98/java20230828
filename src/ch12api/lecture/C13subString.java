package ch12api.lecture;

public class C13subString {
    public static void main(String[] args) {
        String a = "spring";
        String sub1 = a.substring(0,2);

        System.out.println(sub1);

        String sub2 = a.substring(2,5);
        System.out.println(sub2);

        System.out.println(a.substring(5,6));
    }
}
