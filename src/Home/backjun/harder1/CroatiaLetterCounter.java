package Home.backjun.harder1;
import java.util.Scanner;

public class CroatiaLetterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] sentence = (sc.nextLine()).toCharArray();
        int count = 0;
        int i = 0;

        while(i < sentence.length) {
            if(i < sentence.length-1) {
                String twoChars = String.valueOf(sentence[i]) + String.valueOf(sentence[i+1]);
                switch(twoChars) {
                    case "c=":
                    case "c-":
                    case "d-":
                    case "lj":
                    case "nj":
                    case "s=":
                    case "z=":
                        count++;
                        i+=2;
                        break;
                    case "dz":
                        if(i < sentence.length -2 && sentence[i+2] == '=') {
                            count++;
                            i+=3;
                        } else {
                            count++;
                            i++;
                        }
                        break;
                    default:
                        count++;
                        i++;
                        break;
                }
            } else {
                count++;
                i++;
            }
        }

        System.out.println(count);

    }
}
