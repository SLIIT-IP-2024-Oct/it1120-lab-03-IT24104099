import java.util.Scanner;

public class IT24104099Lab3Q4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

	
		System.out.print("Enter a five digit number:");

		int number = scanner.nextInt();

		for(int i = 10000; i >= 1; i /= 10) {

			int digit = number / i;

			System.out.print(digit + " ");

			number %= i;

		}

		System.out.println();

	}

}
