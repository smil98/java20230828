package bakjun;
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N; //subject
        double max = 0, sum =0;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        double[] score = new double[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            score[i] = Double.parseDouble(st.nextToken());
            if(score[i] > max) {
                max = score[i];
            }
        }

        for(int i = 0; i < N; i++) {
            score[i] = score[i]/max*100;
            sum += score[i];
        }

        double avg = sum / (double)N;

        bw.write(String.valueOf(avg));


        br.close();
        bw.flush();
        bw.close();
    }
}