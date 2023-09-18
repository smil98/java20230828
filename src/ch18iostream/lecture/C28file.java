package ch18iostream.lecture;

import java.io.File;
import java.util.Date;

public class C28file {
    public static void main(String[] args) {
        //File
        String path = "src/ch18iostream/lecture/C28file.java";
        File file = new File(path);

        System.out.println("file.exists() = " + file.exists());
        System.out.println("file.length() = " + file.length());
        System.out.println("file.getPath() = " + file.getPath());
        System.out.println("file.lastModified() = " + file.lastModified());
        System.out.println("new Date(file.lastModified()) = " + new Date(file.lastModified()));
        System.out.println("file.isDirectory() = " + file.isDirectory());

    }
}
