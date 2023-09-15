package ch18iostream.lecture;

import java.io.*;

public class C13writer {
    public static void main(String[] args) {
        String file1 = "C:/Temp/out5.txt";
        String file2 = "C:/Temp/out6.txt";

        try {
            OutputStream os = new FileOutputStream(file1);
            Writer writer = new FileWriter(file2);

            try(os; writer) {
                os.write(65); //Byte Stream
                writer.write(65);  //Character Stream

                os.write(48124); //comes out as ?
                writer.write(48124); //comes out as 민
                //thus have to consider what method is best suitable

                os.flush();
                writer.flush();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
