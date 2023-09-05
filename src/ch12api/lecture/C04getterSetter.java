package ch12api.lecture;

public class C04getterSetter {
    public static void main(String[] args) {
        MyClass04 o1 = new MyClass04("손흥민", 32);
        System.out.println(o1);

        System.out.println("after change");

        o1.setName("홍길동");
        o1.setAge(27);

        System.out.println(o1);

    }
}

class MyClass04 {
    private String name;
    private int age;

    public MyClass04(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyClass04{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}