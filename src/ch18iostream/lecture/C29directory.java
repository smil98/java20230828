package ch18iostream.lecture;

import java.io.File;

public class C29directory {
    public static void main(String[] args) {
        String path = "C:/Temp";
        File file = new File(path);
        System.out.println("file.isDirectory() = " + file.isDirectory());
        File[] files = file.listFiles();
        for(File f : files) {
            System.out.println("f.getName() = " + f.getName());
        }

    }
}
