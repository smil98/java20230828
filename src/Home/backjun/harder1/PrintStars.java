package Home.backjun.harder1;
import java.util.Scanner;

public class PrintStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        for(int i = 0; i < radius; i++) {
            for(int j = 1; j < radius-i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < (2*i)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = radius-2; i >= 0; i--) {
            for(int j = 1; j < radius-i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < (2*i)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
