package ch12api.lecture;

public class C06hashCode {
    public static void main(String[] args) {
        String o1 = new String("java");
        String o2 = new String("spring");
        String o3 = new String("java");

        System.out.println(o1 == o2); //false
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

        System.out.println(o1 == o3); //false
        System.out.println(o1.hashCode());
        System.out.println(o3.hashCode()); //but hashCodes are equivalent
        //bc hashcode is calculated with certain formula, and o1, o3 content are equivalent hashcodes will match

    }
}
