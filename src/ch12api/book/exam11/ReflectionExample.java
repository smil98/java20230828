package ch12api.book.exam11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        Class c1 = Car.class;
        System.out.println("--Constructor info--");
        Constructor[] constructors = c1.getDeclaredConstructors();
        for(Constructor constructor : constructors) {
            System.out.print(constructor.getName() + "(");
            Class[] parameters = constructor.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }
        System.out.println();

        System.out.println("--Field info--");
        Field[] fields = c1.getDeclaredFields();
        for(Field field : fields) {
            System.out.println(field.getType().getName() + " " + field.getName());
        }
        System.out.println();

        System.out.println("--Method info--");
        Method[] methods = c1.getDeclaredMethods();
        for(Method method : methods) {
            System.out.print(method.getName() + "(");
            Class[] parameters = method.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }
    }

    private static void printParameters(Class[] parameters) {
        for(int i = 0; i < parameters.length; i++) {
            System.out.print(parameters[i].getName());
            if(i<(parameters.length-1)) {
                System.out.print(",");
            }
        }
    }
}
