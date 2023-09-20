package ch19networkio.lecture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class C07client {
    public static void main(String[] args) {
        //server -> client sending mail

        try {
            Socket socket = new Socket("172.30.1.xx", 5000);
            InputStream is = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            String path = "C:/Temp/test-server.jpg";
            FileOutputStream fos = new FileOutputStream(path);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            try (is; bis; fos; bos){
                byte[] bytes = new byte[1024];
                int len = 0;

                while((len = bis.read(bytes))!= -1) {
                    bos.write(bytes, 0, len);
                }
                bos.flush();
                System.out.println("Client has received all files.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
