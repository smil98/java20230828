package ch06class;

public class C10capsule {
    //
}

class MyClass10 {
    private int age;
    private String name;
    //if no special occasion just add private to enhance security
    //if private is used, add get, set methods as "public" to change variable

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
