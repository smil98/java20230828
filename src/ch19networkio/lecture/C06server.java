package ch19networkio.lecture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C06server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3000);
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);

            String path = "C:/Temp/test-client.jpg";
            FileOutputStream fos = new FileOutputStream(path);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            try(serverSocket; socket; is; bis; fos; bos) {
                byte[] bytes = new byte[1024];
                int len = 0;
                while((len = bis.read(bytes)) != -1) {
                    bos.write(bytes, 0, len);
                }
                bos.flush();
                System.out.println("파일 받기 완료.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
