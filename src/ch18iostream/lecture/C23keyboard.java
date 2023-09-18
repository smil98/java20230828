package ch18iostream.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C23keyboard {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try(br) {
                String str = br.readLine();
                System.out.println("str = " + str);
                String str2 = br.readLine();
                System.out.println("str2 = " + str2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
