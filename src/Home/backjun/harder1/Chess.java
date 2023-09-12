package Home.backjun.harder1;
import java.io.*;
import java.util.StringTokenizer;

public class Chess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int piece;

        int[] chess = {1, 1, 2, 2, 2, 8};
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < chess.length; i++) {
            piece = Integer.parseInt(st.nextToken());
            chess[i] = chess[i] - piece;
        }

        for(int a : chess) {
            System.out.print(a + " ");
        }

        br.close();

    }
}
