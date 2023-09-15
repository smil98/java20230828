package ch18iostream.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class C09read {
    public static void main(String[] args) {
        try(InputStream is = new FileInputStream("C:/Temp/out3.txt")) {
            byte[] b = new byte[3];
            is.read(b);
            System.out.println("Arrays.toString(b) = " + Arrays.toString(b));
            is.read(b);
            System.out.println("Arrays.toString(b) = " + Arrays.toString(b));
            is.read(b);
            System.out.println("Arrays.toString(b) = " + Arrays.toString(b));
            is.read(b);
            System.out.println("Arrays.toString(b) = " + Arrays.toString(b));

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
