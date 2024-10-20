import java.util.Scanner;

public class PurchaseDiscount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        double discount = 0.0;
        double finalAmount = 0.0;


        if (purchaseAmount < 500) {
            discount = 0; // No discount for purchase amounts less than 500
        } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            discount = 0.10 * purchaseAmount; // 10% discount for amounts between 500 and 1000
        } else if (purchaseAmount > 1000) {
            discount = 0.20 * purchaseAmount; // 20% discount for amounts greater than 1000
        }

// Calculate the final payable amount
        finalAmount = purchaseAmount - discount;

// Output the final amount and discount
        System.out.println("Discount applied: $" + discount);
        System.out.println("Final payable amount: $" + finalAmount);

// Close the scanner
        scanner.close();
    }
}