import java.util.Scanner;

public class IT24104099Lab3Q3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

	
		System.out.print("Enter the rupee amount:");

		int amount = scanner.nextInt();


		int[] notes = {5000,1000,500,200,100,50,20,10,5,2,1};

		int[] count = new int[notes.length];


		for(int i = 0; i < notes.length; i++) {

			if (amount >= notes[i]) {

			count[i] = amount / notes[i];

			amount %= notes[i];

			}

		}

		
		System.out.println("5000 notes:" + count[0]);
		
		System.out.println("1000 notes:" + count[1]);

		System.out.println("500 notes:" + count[2]);

		System.out.println("200 notes:" + count[3]);

		System.out.println("100 notes:" + count[4]);

		System.out.println("50 notes:" + count[5]);

		System.out.println("20 notes:" + count[6]);

		System.out.println("10 notes:" + count[7]);

		System.out.println("5 notes:" + count[8]);

		System.out.println("2 notes:" + count[9]);

		System.out.println("1 notes:" + count[10]);

		

	}

}