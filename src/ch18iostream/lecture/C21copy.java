package ch18iostream.lecture;

import java.io.*;

public class C21copy {
    //BufferedInputStream, BufferedOutputStream
    public static void main(String[] args) {
        try(InputStream is = new FileInputStream("C:/Temp/image.jpg");
            OutputStream os = new FileOutputStream("C:/Temp/image_copy.jpg")) {
            try(InputStream isw = new BufferedInputStream(is);
                OutputStream osw = new BufferedOutputStream(os)) {
                byte[] data = new byte[1024];
                int len;
                while((len = isw.read(data)) != -1) {
                    osw.write(data, 0, len);
                }
                osw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
