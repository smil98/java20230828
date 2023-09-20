package ch05reference.lecture;

public class C13enum {
    public static void main(String[] args) {
        MyEnum v1 = MyEnum.VALUE1;
        MyEnum v2 = MyEnum.VALUE2;
        MyEnum v3 = MyEnum.VALUE3;
        MyEnum v4 = MyEnum.VALUE_4;
        MyEnum v5 = MyEnum.VALUE3;
        //can only create 4 instance
        System.out.println("(v1==v2) = " + (v1==v2)); //t
        System.out.println("(v3==v4) = " + (v3 == v4)); //f
        System.out.println("(v3==v5) = " + (v3==v5)); //t
        //since value is limited to four can use == even though it's reference
        System.out.println("v3.equals(v5) = " + v3.equals(v5)); //t
    }
}

enum MyEnum {
    //seperate by comma
    //name syntax = UPPERCASE_AND_UNDERBAR
    VALUE1,
    VALUE2,
    VALUE3,
    VALUE_4
}