import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        double number = scanner.nextDouble();
        if (number > 0) {
            System.out.println(number + "is positive number.");
        }
        else if (number < 0) {
            System.out.println(number + "is a negative number.");
        }
        else {
            System.out.println("The number is zero.");
        }
        scanner.close();
    }
}