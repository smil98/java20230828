package Home.backjun;
import java.io.*;
import java.util.StringTokenizer;

public class String06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T;

        T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            StringBuilder result = new StringBuilder();

            for(int j = 0; j < S.length(); j++) {
                char c = S.charAt(j);
                for(int k = 0; k < R; k++) {
                    result.append(c);
                }
            }
            bw.write(result.toString() + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
