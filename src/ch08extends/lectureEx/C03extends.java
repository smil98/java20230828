package ch08extends.lectureEx;

public class C03extends {
    public static void main(String[] args) {
        MySubClass031 o1 = new MySubClass031();
        o1.printName();
        System.out.println("get, set 활용");
        o1.setName("java");
        System.out.println("o1.getName() = " + o1.getName());
        o1.printModel();
        System.out.println("model setting");
        o1.setModel();
        o1.printModel();

    }
}

class MyClass03 {
    private String name;
    protected String model;

    void printName() {
        System.out.println("name = " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class MySubClass031 extends MyClass03 {
    //private field cannot be inherited
    //protected allows sharing amongst parent and child
    void setModel() {
        model = "spring";
    }
    void printModel() {
        System.out.println("model = " + model);
    }
}
