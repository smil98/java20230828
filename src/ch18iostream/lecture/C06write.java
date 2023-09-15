package ch18iostream.lecture;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C06write {
    public static void main(String[] args) {
        String path = "C:/Temp/out3.txt";
        try(OutputStream os = new FileOutputStream(path)) {
            byte[] b = {65, 80, 80, 76, 69};
            os.write(b);
//            os.write('\n');
            os.write(b, 0, 3);
//            os.write('\n');
            os.write(b, 2, 2);
            os.flush();
        } catch( IOException e) {
            e.printStackTrace();
        }

        System.out.println("Process Finished.");
    }
}
