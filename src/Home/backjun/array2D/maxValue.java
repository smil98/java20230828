package Home.backjun.array2D;
import java.io.*;
import java.util.StringTokenizer;

public class maxValue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int maxValue = -1;
        int maxIndexX = 0;
        int maxIndexY = 0;
        int[][] array = new int[9][9];

        for(int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
                if(array[i][j] > maxValue) {
                    maxIndexX = i+1;
                    maxIndexY = j+1;
                    maxValue = array[i][j];
                }
            }
        }

        System.out.println(maxValue);
        System.out.println(maxIndexX + " " + maxIndexY);
        br.close();

    }
}
