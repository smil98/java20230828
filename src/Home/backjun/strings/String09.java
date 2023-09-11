package Home.backjun.strings;
import java.util.Scanner;

public class String09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dial = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        int sum = 0;

        String word = sc.nextLine();

        for(int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            for(int j = 0; j < dial.length; j++) {
                if(dial[j].contains(String.valueOf(letter))) {
                    sum += j+3;
                }
            }
        }

        System.out.println(sum);
    }
}
