package Home.stream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class server {
    public static void main(String[] args) {
        System.out.println("Welcome to Chatting Program💕");
        try(ServerSocket serverSocket = new ServerSocket(7000)) {
            while(true) {
                try {
                    Socket socket = serverSocket.accept();
                    Thread t = new Thread(() -> {
                        try {
                            InputStream inputStream = socket.getInputStream();
                            Reader reader = new InputStreamReader(inputStream);
                            BufferedReader br = new BufferedReader(reader);
                            try (br; reader; inputStream; socket) {
                                String line = null;
                                SocketAddress address = socket.getRemoteSocketAddress();
                                System.out.println(address + " has entered the room");

                                while ((line = br.readLine()) != null) {
                                    System.out.println(address + ": " + line);
                                    if (line.equals("bye")) {
                                        System.out.println(address + " has left the room");
                                        break;
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    });
                    t.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
