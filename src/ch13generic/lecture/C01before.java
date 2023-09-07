package ch13generic.lecture;

public class C01before {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        o1.setA("java");

        MyClass01 o2 = new MyClass01();
        o2.setA(3);

        MyClass01 o3 = new MyClass01();
        o3.setA(true);
        //no problem cuz auto boxing

        Object f1 = o1.getA();
        Object f2 = o2.getA();
        Object f3 = o3.getA();

        String g1 = (String) f1;
        Integer g2 = (Integer) f2;
        Boolean g3 = (Boolean) f3;
        //had to convert type to use method specific to certain type
        //provokes mistakes

        //generic is a concept to allow type conversions and prevent mistakes happening



    }
}

class MyClass01 {
    private Object a;

    public void setA(Object a) {
        this.a = a;
    }

    public Object getA() {
        return a;
    }
}
