package ch12api.lecture;

public class C02toString {
    public static void main(String[] args) {
        MyClass12 o1 = new MyClass12();
        String s1 = o1.toString();
        System.out.println("s1 = " + s1);
        
        Object o2 = o1;
        System.out.println("o2 = " + o2);
    }
}

class MyClass12 { //extends Object automatically inserted by compiler
    @Override
    public String toString() {
        return "MyClass02 객체입니다.";
    }
}