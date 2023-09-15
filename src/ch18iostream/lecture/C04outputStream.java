package ch18iostream.lecture;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C04outputStream {
    public static void main(String[] args) {
        String path = "C:/Temp/out1.txt";
        try (OutputStream os = new FileOutputStream(path)) {
            os.write(65);
            os.write(66);
            os.write(67);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Finished.");
    }
}
