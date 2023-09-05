package ch12api.lecture;

public class C14charAt {
    public static void main(String[] args) {
        String a = "java";

        String str = "hello";
        String answer = "";

        for(int i = 0; i < str.length(); i++) {
            answer += Character.toString(str.charAt(i)) + str.charAt(i);
        }

        System.out.println(answer);
    }

}
