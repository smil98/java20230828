package ch18iostream.lecture;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class C15reader {
    public static void main(String[] args) {

        try(Reader reader = new FileReader("C:/Temp/out7.txt")) {
            int read1 = reader.read();
            char c = (char) read1;
            int read2 = reader.read();
            int read3 = reader.read();

            System.out.println("read1 = " + read1); //손
            System.out.println("read2 = " + read2); //흥
            System.out.println("read3 = " + read3); //민

            System.out.println("c = " + c);
            System.out.println("read1 = " + (char)read1);
            System.out.println("read2 = " + (char)read2);

            char[] chars = new char[3];
            int len1 = reader.read(chars);
            System.out.println("chars = " + Arrays.toString(chars));
            int len2 = reader.read(chars);
            System.out.println("chars = " + Arrays.toString(chars));
            int len3 = reader.read(chars);
            System.out.println("chars = " + Arrays.toString(chars));

            System.out.println("len1 = " + len1);
            System.out.println("len2 = " + len2);
            System.out.println("len3 = " + len3);

        } catch (IOException e) {

        }
    }
}
