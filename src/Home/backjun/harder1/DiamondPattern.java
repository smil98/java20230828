package Home.backjun.harder1;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5; // Adjust this value to control the size of the diamond

        // Print the top half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }

        // Print the bottom half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }
    }
}
