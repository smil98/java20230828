package ch12api.lecture;

public class C19wrapper {
    public static void main(String[] args) {
        //wrapper class : class boxing primitive type

        //primitive type: byte, short, int, long, float, double, char, boolean
        //wrapper Class : Byte, Short, Integer, Long, Float, Double, Character, Boolean

        //boxing
        int i = 500;
        Integer j = new Integer(i);
        //deprecated or marked for removal
        Integer k = Integer.valueOf(i); //recommended boxing

        Integer l = Integer.valueOf(1000);
        int m = l.intValue(); //unboxing

        //auto boxing
        int n = 777;
//        Integer o = Integer.valueOf(n);
        //can shorten down to
        Integer o = n;

        Integer p = Integer.valueOf(888);
        int q = p;



        System.out.println(i);
        System.out.println(j);
    }
}
