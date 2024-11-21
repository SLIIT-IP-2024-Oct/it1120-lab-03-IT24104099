import java.util.Scanner;

public class IT24104099Lab3Q2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

	
		System.out.print("Enter the monthly salary:");

		double monthlysalary = scanner.nextDouble();


		System.out.print("Enter the number of OT hours:");

		double otHours= scanner.nextDouble();


		System.out.print("Enter the ot hours rate:");

		double otrate= scanner.nextDouble();



		double otAmount = otHours * otrate;

		
		double totalsalary = monthlysalary + otAmount;


		
		System.out.println("Total salary:" + totalsalary);

		scanner.close();

	}

}