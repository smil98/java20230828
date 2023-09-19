package ch19networkio.lecture;

import java.io.*;
import java.net.Socket;

public class C10client {
    public static void main(String[] args) {
        // 172.30.1.81 7000

        try {
            Socket socket = new Socket("172.30.1.81", 7000);
            Writer writer = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter bw = new BufferedWriter(writer);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            try (socket; writer; bw; br) {
                String line;
                while ((line = br.readLine()) != null) {
                    bw.write(line);
                    bw.newLine();
                    bw.flush();
                    if (line.equals("bye")) {
                        break;
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
