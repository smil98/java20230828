package ch12api.lecture;

public class C22wrapper {
    public static void main(String[] args) {
        Integer i = 3000;
        Integer j = 3000;

        int k = 30;
        int l = 30;

        System.out.println(k == l);
        System.out.println(i == j); //compares reference address thus false;

        System.out.println(i.equals(j));

    }
}
