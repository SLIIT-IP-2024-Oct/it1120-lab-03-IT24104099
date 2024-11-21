import java.util.Scanner;

public class IT24104049Lab3Q1B {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

	
		System.out.print("Enter the price of 1kg of rice:");

		double pricePerkg =scanner.nextDouble();

		System.out.print("Enter the number of kilograms you want to buy:");

		double qualntity = scanner.nextDouble();


		double totalAmount = pricePerkg * qualntity;

		double discount =0.1* totalAmount;

		double amountAfterDiscount = totalAmount - discount;

		
		System.out.println("The total amount with 10% discount is:" + amountAfterDiscount);

		scanner.close();

	}

}