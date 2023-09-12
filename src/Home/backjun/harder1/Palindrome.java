package Home.backjun.harder1;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        StringBuilder half1 = new StringBuilder();
        StringBuilder half2 = new StringBuilder();

        for(int i = 0; i < word.length(); i++) {
            half1.append(word.charAt(i));
        }

        for(int j = word.length()-1; j >= 0; j--) {
            half2.append(word.charAt(j));
        }

        if(half1.compareTo(half2) == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
