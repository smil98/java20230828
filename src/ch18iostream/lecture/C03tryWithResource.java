package ch18iostream.lecture;

import java.io.*;
import java.util.Scanner;

public class C03tryWithResource {
    public static void main(String[] args) {

    }

    public void method1() {
        OutputStream os = null;

        try {
            os = new FileOutputStream("");
            os.write(110);
            os.write(111);
            os.write(112);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        //must close os.stream but the code gets intricate
    }

    public void method2() {
        try(OutputStream os = new FileOutputStream("")) {
            os.write(33);
            os.write(67);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //automatically closes os
        //this is called try-with-resource syntax
    }

    public void method3() {
        try (
                FileOutputStream fos = new FileOutputStream("");
                FileInputStream fis = new FileInputStream("")
        )
        {
            fos.write(234);
            fos.write(234);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void method4() {
        Scanner scanner = new Scanner("");

        try (scanner) {
            //if there was one input, can just use instance variable in try()
            scanner.hasNext();
            scanner.next();
        }
    }

    public void method5() {
        try {
            FileOutputStream fos = new FileOutputStream("");
            FileInputStream fis = new FileInputStream("");
            try(fos; fis) {
                fis.read();
                fos.write(23);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void method6() throws IOException {
        FileOutputStream fos = new FileOutputStream("");
        FileInputStream fis = new FileInputStream("");

        fos.write(33);
        fis.read();

        fos.close();
        fis.close();

        //this works, but is not a great code bc
        // if an exception is thrown the method will crash
        // and omit some process that may be mandatory
    }
}
