package ch12api.lecture;

public class C20wrapper {
    public static void main(String[] args) {
        int i = 3;
        Integer j = Integer.valueOf(i); //old version
        Object k = j;

        int l = 5;
        Integer m = l;
        Object n = m;

        Object o = 7;


        Integer q = (Integer) o; //caution!!
        int r = q;

        int s = 30; //4 byte
        long t = s; // 8 byte
        //conversion no prob

        Integer u = 300;
//        Long v = u;
        //error bc polymorphism

        float w = 3.14f;
        double x = w;

        Float y = 3.14f;
//        Double z = y;
        //error bc polymorphism

    }
}
