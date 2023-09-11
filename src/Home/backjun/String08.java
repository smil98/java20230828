package Home.backjun;
import java.io.*;
import java.util.StringTokenizer;

public class String08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String num1 = st.nextToken();
        String num2 = st.nextToken();

        StringBuilder newNum1 = new StringBuilder();
        StringBuilder newNum2 = new StringBuilder();

        newNum1.append(num1.charAt(2)).append(num1.charAt(1)).append(num1.charAt(0));
        newNum2.append(num2.charAt(2)).append(num2.charAt(1)).append(num2.charAt(0));

        if(Integer.parseInt(String.valueOf(newNum1)) > Integer.parseInt(String.valueOf(newNum2))) {
            bw.write(String.valueOf(newNum1));
        } else bw.write(String.valueOf(newNum2));

        br.close();
        bw.flush();
        bw.close();
    }
}
