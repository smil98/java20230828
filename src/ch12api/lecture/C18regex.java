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

        //{} only applies to character beforehand

        System.out.println("dodog".matches("do{1,3}g"));
        //apply parenthesis for multiple characters
        System.out.println("dododog".matches("(do){1,3}g"));

        //if you can't specify quantity
        System.out.println("dog".matches("do{1,}g")); // true
        System.out.println("doog".matches("do{1,}g")); // true
        System.out.println("dooog".matches("do{1,}g")); // true
        System.out.println("doooog".matches("do{1,}g")); // true
        System.out.println("dooooooog".matches("do{1,}g")); //true

        //exists or not
        System.out.println("dg".matches("do?g"));
        System.out.println("dog".matches("do?g"));
        System.out.println("doog".matches("do?g")); //f

        //more than 0
        System.out.println("dg".matches("do*g")); // true
        System.out.println("dog".matches("do*g")); // true
        System.out.println("doog".matches("do*g")); // true
        System.out.println("dooog".matches("do*g")); // true
        System.out.println("doooog".matches("do*g")); // true

        //more than once
        System.out.println("dg".matches("do+g")); // false
        System.out.println("dog".matches("do+g")); // true
        System.out.println("doog".matches("do+g")); // true
        System.out.println("dooog".matches("do+g")); // true
        System.out.println("doooog".matches("do+g")); // true

        //or
        System.out.println("dog".matches("d[oi]g")); // true
        System.out.println("dig".matches("d[oi]g")); // true
        System.out.println("dag".matches("d[io]g")); //false

        //!=
        System.out.println("dog".matches("d[^oi]g")); // false
        System.out.println("dig".matches("d[^oi]g")); // false
        System.out.println("dag".matches("d[^oi]g")); // true

        //true within range
        System.out.println("dag".matches("d[a-z]g")); // true
        System.out.println("dbg".matches("d[a-z]g")); // true
        System.out.println("dcg".matches("d[a-z]g")); // true
        System.out.println("dzg".matches("d[a-z]g")); // true

        //more than two range
        System.out.println("dag".matches("d[a-cx-z]g")); // true
        System.out.println("dbg".matches("d[a-cx-z]g")); // true
        System.out.println("dcg".matches("d[a-cx-z]g")); // true
        System.out.println("ddg".matches("d[a-cx-z]g")); // false
        System.out.println("deg".matches("d[a-cx-z]g")); // false
        System.out.println("dfg".matches("d[a-cx-z]g")); // false
        System.out.println("dxg".matches("d[a-cx-z]g")); // true
        System.out.println("dyg".matches("d[a-cx-z]g")); // true
        System.out.println("dzg".matches("d[a-cx-z]g")); // true


        // 문자 분류 기호
        System.out.println("0".matches("[0-9]")); // true
        System.out.println("7".matches("[0-9]")); // true
        System.out.println("0".matches("\\d")); // true
        System.out.println("7".matches("\\d")); // true

        System.out.println("a".matches("[a-zA-Z_0-9]")); // true
        System.out.println("_".matches("\\w")); // true
        System.out.println("8".matches("\\w")); // true

        // 예제 자바 변수명 작성규칙
        // : 숫자로 시작하면 안되고, 영문대소문자, _, $, 숫자
        String pattern = "[a-zA-Z_$][a-zA-Z_$0-9]*";
        System.out.println("pattern_1".matches(pattern)); // true
        System.out.println("_".matches(pattern));
        System.out.println("$".matches(pattern));
        System.out.println("4".matches(pattern));

        // 전화번호 패턴
        // 010-9999-9999
        // 02-9999-9999
        // 02-999-9999
        // 01099999999
        // 0212345678
        // 021235678
        //
        String pattern2 = "\\d{2,3}-?\\d{3,4}-?\\d{4}";
        System.out.println("010-9999-9999".matches(pattern2));
        System.out.println("02-9999-9999".matches(pattern2));
        System.out.println("02-999-9999".matches(pattern2));
        System.out.println("01099999999".matches(pattern2));
        System.out.println("0212345678".matches(pattern2));
        System.out.println("021235678".matches(pattern2));

        // 모든 문자 : .
        System.out.println(" ".matches("."));
        System.out.println("a".matches("."));
        System.out.println("3".matches("."));
        System.out.println("+".matches("."));
        System.out.println(".".matches("."));

        // . : \.
        System.out.println(" ".matches("\\.")); // false
        System.out.println("a".matches("\\.")); // false
        System.out.println("3".matches("\\.")); // false
        System.out.println("+".matches("\\.")); // false
        System.out.println(".".matches("\\.")); // true

        // 이메일 패턴
        // 영문소문자,숫자가 여러개  @  영문소문자,숫자 여러개 . 영문소문자,숫자 여러개
        // john23@google3.co2m
        String pattern3 = "[a-z0-9]+@[a-z0-9]+\\.[a-z0-9]+";

        System.out.println("john23@google3.co2m".matches(pattern3));
        System.out.println("john23google3.co2m".matches(pattern3));
        System.out.println("john23@google3co2m".matches(pattern3));

        // or : |
        System.out.println("auefhdogsod".matches(".*dog.*"));
        System.out.println("832catlkd".matches(".*cat.*"));
        System.out.println("auefhdogsod".matches(".*(dog|cat).*"));
        System.out.println("832catlkd".matches(".*(dog|cat).*"));

        System.out.println("손흥민".matches("[가-힣]{3}"));
        System.out.println("이강인".matches("[가-힣]{3}"));
        System.out.println("해리케인".matches("[가-힣]{3}"));

    }
}