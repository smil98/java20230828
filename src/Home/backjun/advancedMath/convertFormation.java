package Home.backjun.advancedMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class convertFormation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] N = st.nextToken().toCharArray();
        int B = Integer.parseInt(st.nextToken());
        int answer = 0;

        for(int i = 0; i < N.length; i++) {
            int digitValue =0;
            if(Character.isDigit(N[i])) {
                digitValue = N[i] - '0';
            } else if (Character.isUpperCase(N[i])) {
                digitValue = N[i] - 'A' + 10;
            }
            answer = answer * B + digitValue;
        }

        System.out.println(answer);
    }
}
