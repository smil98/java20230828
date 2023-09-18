package ch18iostream.book.exam11;

import java.io.*;

public class Question10 {
    public static void main(String[] args) {
        String origPath = null;
        String copyPath = null;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("원본 파일 경로: ");
            origPath = br.readLine();
            System.out.print("복사 파일 경로: ");
            copyPath = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File origFile = new File(origPath);
        File copyFile = new File(copyPath);

        if (!origFile.exists()) {
            System.out.println("원본 파일이 존재하지 않습니다.");
        } else {
            try {
                if (!copyFile.exists()) {
                    File parentDir = copyFile.getParentFile();
                    if (parentDir != null) {
                        parentDir.mkdirs();
                    }
                }

                try (InputStream is = new FileInputStream(origFile);
                     OutputStream os = new FileOutputStream(copyFile)) {
                    try (BufferedInputStream isw = new BufferedInputStream(is);
                         BufferedOutputStream osw = new BufferedOutputStream(os)) {
                        byte[] data = new byte[1024];
                        int len;
                        while ((len = isw.read(data)) != -1) {
                            osw.write(data, 0, len);
                        }
                        osw.flush();
                        System.out.println("복사가 성공적으로 되었습니다.");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
