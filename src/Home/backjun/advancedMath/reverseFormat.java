package Home.backjun.advancedMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class reverseFormat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        StringBuilder answer = new StringBuilder();

        while(N > 0) {
            int remainder = N % B;
            char digitChar;
            if(remainder < 10) {
                digitChar = (char) ('0' + remainder);
            } else {
                digitChar = (char) ('A' + remainder);
            }

            answer.append(digitChar);
            N /= B;
        }

        System.out.println(answer);
    }
}
