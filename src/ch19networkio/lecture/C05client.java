package ch19networkio.lecture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class C05client {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("172.30.1.43", 3000);
            String path = "C:/Temp/test.jpg";
            FileInputStream fi = new FileInputStream(path);
            BufferedInputStream bis = new BufferedInputStream(fi);

            OutputStream os = socket.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os);
            try (socket; fi; bis; os; bos) {
                byte[] bytes = new byte[1024];
                int len = 0;
                while((len = bis.read(bytes)) != -1) {
                    bos.write(bytes, 0, len);
                }
                bos.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
