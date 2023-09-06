package ch12api.lecture;

public class C15indexOf {
    public static void main(String[] args) {
        String a = "spring";
        int index = a.indexOf("ring");

        System.out.println(index);

        String b = "spring is spring";
        System.out.println(b.indexOf("ring"));

        System.out.println(b.indexOf("ring", 3));

        String countHi = "ABChi hi";
        int count = 0;
        for(int i = 0; i< countHi.length()-1; i++) {
            String x = countHi.substring(i, i+2);
            if(x.equals("hi")) {
                count++;
            } else continue;
        }

        System.out.println(count);

    }
}
