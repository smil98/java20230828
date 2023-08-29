package ch06class;

public class C05class {
    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05();
        MyClass05 o2 = new MyClass05();

        System.out.println("o1의 참조값" + System.identityHashCode(o1));
        o1.age = 30;
        o1.model = "java"; //instance field 처럼 보이기 때문에 권장하지 않는 코드 작성 방식
        MyClass05.model = "spring"; //권장 문법
        System.out.println("o1.age = " + o1.age);
        System.out.println("o2.age = " + o2.age);
        System.out.println("o1.model = " + o1.model);
        System.out.println("o2.model = " + o2.model); //static으로 클래스 내에서 공유하기 때문에 java

    }
}

class MyClass05 {
    int age; // instance field
    static String model; //static field, class field, 정적 필드
}
