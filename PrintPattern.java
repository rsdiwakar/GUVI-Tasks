import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {
// Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

// Prompt user for input for i, j, and k
        System.out.print("Enter a value for i, j, and k (same value for all): ");
        int n = scanner.nextInt();

// Nested loops to print the pattern
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(j); // Print decreasing numbers
            }
            for (int k = 0; k < i; k++) {
                System.out.print(n - i); // Print repeated numbers
            }
            System.out.println(); // Move to the next line
        }

// Close the scanner
        scanner.close();
    }
}