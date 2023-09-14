package ch18iostream.lecture;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02textInputStream {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("out.txt");
            os.write(70);
            os.write(71);
            os.write(73); //results out.txt of 3 bytes, changed to ASCII code
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
