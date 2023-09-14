package ch11exception.lecture;

public class C14throw {
    public static void main(String[] args) {
        System.out.println("main code1");
        try {
            method3();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main code2");
    }

    public static void method3() throws Exception {
        throw new Exception(); //since compiler does not "check"
        //Exception = Unchecked Exception, so have to specify
    }
}
