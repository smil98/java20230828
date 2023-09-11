package Home.backjun;

import java.util.Scanner;
public class String01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int index = sc.nextInt() - 1;

        System.out.println(word.charAt(index));
        sc.close();
    }
}
