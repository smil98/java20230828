package Home.backjun;
import java.io.*;
import java.util.StringTokenizer;

public class String03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T, i;

        T = Integer.parseInt(br.readLine());

        for(i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
            bw.write(word.charAt(0) + "" + word.charAt(word.length()-1) +"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
