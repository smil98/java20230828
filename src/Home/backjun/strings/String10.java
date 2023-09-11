package Home.backjun.strings;
import java.io.*;

public class String10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder all = new StringBuilder();
        String words;

        while((words = br.readLine()) != null) {
            if(words.isEmpty()) {
                break;
            }
            all.append(words).append("\n");
        }

        bw.write(String.valueOf(all));
        bw.flush();
    }
}
