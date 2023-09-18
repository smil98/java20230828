package ch18iostream.book.exam10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Example {
    public static void main(String[] args) throws Exception {
        String filePath = "src/ch18iostream/book/exam10/Example.java";
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        int rowNumber = 0;
        String rowData;
        while(true) {
            rowData = br.readLine();
//            if(rowData == null) break;
            if(rowNumber == 25) break;
            System.out.println(rowData);
            rowNumber++;
        }

        br.close(); fr.close();
    }
}