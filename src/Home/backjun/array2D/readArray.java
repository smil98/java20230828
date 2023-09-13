package Home.backjun.array2D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class readArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] inputArray = new char[5][5];
        int maxLength = 0;

        // Read input lines and determine the maximum length
        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            inputArray[i] = line.toCharArray();
            maxLength = Math.max(maxLength, line.length());
        }

        // Process and combine columns
        StringBuilder result = new StringBuilder();

        for (int col = 0; col < maxLength; col++) {
            for (int row = 0; row < 5; row++) {
                if (col < inputArray[row].length && Character.isLetterOrDigit(inputArray[row][col])) {
                    result.append(inputArray[row][col]);
                }
            }
        }

        System.out.println(result.toString());
    }
}
