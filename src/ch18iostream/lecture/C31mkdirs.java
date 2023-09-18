package ch18iostream.lecture;

import java.io.File;

public class C31mkdirs {
    public static void main(String[] args) {
        String path = "C:/Temp/test1/test2/test3";
        File file = new File(path);
        if(!file.exists()) {
            file.mkdirs();
        }
    }
}
