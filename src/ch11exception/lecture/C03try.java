package ch11exception.lecture;

public class C03try {
    public static void main(String[] args) {
        System.out.println("code1");
        System.out.println("code2");

        try {
            int i = 0;
            int j = 3/i; //Arithmetic Exception
            //originally would stop here w/o printing code3
        } catch(ArithmeticException e) {
            //catch block : catches the exception object and executes
        }


        System.out.println("code3");
    }
}
