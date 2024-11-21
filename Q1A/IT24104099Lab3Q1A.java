import java.util.Scanner;

public class IT24104099Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the price of 1kg of rice
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        // Prompt the user to enter the number of kilograms they want to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        int numberOfKilograms = scanner.nextInt();

        // Calculate the total amount
        double totalAmount = pricePerKg * numberOfKilograms;

        // Display the total amount
        System.out.println("The total amount is: " + totalAmount);

        scanner.close();
    }
}
