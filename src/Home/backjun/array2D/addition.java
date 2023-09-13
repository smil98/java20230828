package Home.backjun.array2D;
import java.io.*;
import java.util.StringTokenizer;

public class addition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int index1 = Integer.parseInt(st.nextToken());
        int index2 = Integer.parseInt(st.nextToken());

        int[][] A = new int[index1][index2];
        int[][] B = new int[index1][index2];


        A = setArray(A, index1, index2, st, br);
        B = setArray(B, index1, index2, st, br);

        for(int i = 0; i < index1; i++) {
            for(int j = 0; j < index2; j++) {
                System.out.printf("%d ", A[i][j] + B[i][j]);
            }
            System.out.println();
        }

        br.close();
    }

    public static int[][] setArray(int[][] array, int x, int y, StringTokenizer st, BufferedReader br) throws IOException {
        for(int i = 0; i < x; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < y; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        return array;
    }
}
