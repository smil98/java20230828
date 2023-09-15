package ch18iostream.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C07inputStream {
    public static void main(String[] args) {
        String path = "C:/Temp/out3.txt";
        try (InputStream is = new FileInputStream(path)) {
//            int read1 = is.read();
//            int read2 = is.read();
//            int read3 = is.read();
//
//            System.out.println("read1 = " + (char)read1);
//            System.out.println("read2 = " + (char)read2);
//            System.out.println("read3 = " + (char)read3);
            int byteRead;
            while((byteRead = is.read()) != -1) {
                System.out.println((char)byteRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
