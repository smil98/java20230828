package ch12api.lecture;

public class C01object {
    public static void main(String[] args) {
        //object
        //super class of all classes
        //super type of all types
        String s = "java";
        Object o1 = s;
        o1.toString();

        Integer i = 3;
        Object o2 = i;
        o2.toString();

        C01object c = new C01object();
        Object o3 = c;
        o3.toString();

        int j = 30;
        Object o4 = j;

    }
}
