package Home.backjun.strings;

import java.util.Scanner;

public class String04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T, i, sum=0;
        String numbers;

        T = Integer.parseInt(sc.nextLine());
        numbers = sc.nextLine();

        for(i = 0; i < T; i++) {
            String s = Character.toString(numbers.charAt(i));
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);
        sc.close();
    }
}
