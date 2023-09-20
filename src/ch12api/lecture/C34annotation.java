package ch12api.lecture;

public class C34annotation {
    @MyAnnotation34(value = "seoul", address="jeju")
    //if just value, ("seoul")
    int field;

    public static void main(String[] args) {

    }
}

@interface MyAnnotation34 {
    //elements (attributes)
    //if element value is used you can omit the type in annotation
    String value();
    String address();

}