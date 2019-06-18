import java.util.Scanner;

public class SumUserNumber {

	public static void main(String[] args) {
		/*
		 * Try writing code that sums user-input numbers. When the user inputs a zero,
		 * print out the sum, and then terminate.
		 */
		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter a number:");
		Double userNumber = userInput.nextDouble();
		Double sum = 0.0;
		Double epsilon = .0000000000001;
		while (Math.abs(userNumber) >= epsilon) {
			sum += userNumber;
			System.out
			.println("Please enter another number to sum.  Enter zero to end the program and display the sum.");
			userNumber = userInput.nextDouble();
		}
		System.out.println("The sum of the numbers entered is " + sum);
	}

}
