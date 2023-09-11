package Home.backjun;

import java.util.Arrays;
import java.util.Scanner;

public class String05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                if (alphabet[index] == -1) {
                    alphabet[index] = i;
                }
            }
        }

        for (int a : alphabet) {
            System.out.print(a + " ");
        }
    }
}

