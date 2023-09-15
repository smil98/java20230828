package ch18iostream.lecture;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C18filter {
    public static void main(String[] args) {
        //sub stream (filter stream)
        //stream that converts other stream

        try {
            OutputStream os = getOutputStream("C:/Temp/out8.txt");
            OutputStreamWriter osw = new OutputStreamWriter(os);
            try (os; osw){
                osw.write('손');
                osw.write('흥');
                osw.write('민');
                osw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static OutputStream getOutputStream(String file) throws IOException {
        OutputStream os = new FileOutputStream(file);
        return os;
    }
}
