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
                int len = 0;
                while((len = isw.read(data)) != -1) {
                    osw.write(data, 0, len);
                }
                osw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


//    String originalFileName = "C:/Temp/test.jpg";
//    String targetFileName = "C:/Temp/test2.jpg";
//
//    InputStream is = new FileInputStream(originalFileName);
//    OutputStream os = new FileOutputStream(targetFileName);
//
//    byte[] data = new byte[1024];
//        while(true) {
//        int num = is.read(data);
//        if(num == -1) break;
//        os.write(data,0, num);
//    }
//        os.flush();
//        os.close();
//        is.close();
//
//        System.out.println("Copied Successfully.");
}
