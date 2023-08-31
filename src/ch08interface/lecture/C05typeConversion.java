package ch08interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C05typeConversion {
    public static void main(String[] args) {
        Integer i = 3;

        //상위 타입으로 형변환하는 코드 작성해보기
        Serializable s = i;
        Comparable<Integer> c = i;
        Constable co = i;
        ConstantDesc cd = i;


    }
}
