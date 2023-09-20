package ch12api.lecture;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class C29annotation {
    @MyAnnotation29
    int field;

    @MyAnnotation29
    public static void main(@MyAnnotation29 String[] args) {
        @MyAnnotation29
        int local;
    }
}

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER, ElementType.CONSTRUCTOR}) //can limit where to put annotation
@interface MyAnnotation29 {
    //ElementType = Enum type
}
