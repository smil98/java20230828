package ch19networkio.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C08server {
    public static void main(String[] args) {
        // server sending files to client
        ServerSocket serverSocket = null;
        try {

            serverSocket = new ServerSocket(5000);

            for (int i = 0; i < 30; i++) {
                Socket socket = serverSocket.accept();

                Thread t = new Thread(() -> {
                    try {

                        String path = "C:/Temp/test.png";
                        InputStream is = new FileInputStream(path);
                        BufferedInputStream bis = new BufferedInputStream(is);

                        OutputStream os = socket.getOutputStream();
                        BufferedOutputStream bos = new BufferedOutputStream(os);

                        try (bos; os; bis; is;) {

                            byte[] bytes = new byte[1024];
                            int len = 0;

                            while ((len = bis.read(bytes)) != -1) {
                                bos.write(bytes, 0, len);
                            }
                            bos.flush();

                            System.out.println("file sent by server😜");
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            socket.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });
                t.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
