package Home.backjun.strings;
import java.util.Scanner;

public class String07 {
    public static void main(String[] args) {
        int count = 0;
        boolean flag = false;
        char blank = ' ';

        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        for(int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) != blank) {
                flag = true;
            } else if( (sentence.charAt(i) == blank) && flag) {
                count++;
                flag = false;
            }
        }

        if(flag) {
            count++;
        }

        System.out.println(count);
    }
}
