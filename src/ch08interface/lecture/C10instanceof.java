package ch08interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C10instanceof {
    public static void main(String[] args) {
        CharSequence c = "java";

        boolean r1 = c instanceof String;
        boolean r2 = c instanceof Serializable;
        boolean r3 = c instanceof Comparable;
        boolean r4 = c instanceof Constable;
        boolean r5 = c instanceof ConstantDesc;
        boolean r6 = c instanceof CharSequence;
        boolean r7 = c instanceof Object;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
        System.out.println(r7);
    }
}
