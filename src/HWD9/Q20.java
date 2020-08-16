/*20.	Write a program to create the equivalent of a four-function calculator. The program to enter two integer’s numbers 
 * and an operator. It then carries out the specified arithmetic operator operation: addition, subtraction, multiplication or 
 * division of the two numbers. Finally, it displays the result.
 */
package HWD9;

import java.util.Scanner;

public class Q20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter arithmetic operation you want to perform");
		String choice = input.next();
		System.out.println("Please enter the first integer number");
		int num1 = input.nextInt();
		System.out.println("Please enter the second integer number");
		int num2 = input.nextInt();
		switch (choice) {
		case "addition":
			int add = (num1 + num2);
			System.out.println("The required addition of the given integers is " + add + ".");
			break;
		case "subtraction":
			int sub = (num1 - num2);
			System.out.println("The required suntraction of the given integers is " + sub + ".");
			break;
		case "multiplication":
			int mul = (num1 * num2);
			System.out.println("The required multiplication of the given integers is " + mul + ".");
			break;
		case "division":
			int div = (num1 / num2);
			System.out.println("The required division of the given integers is " + div + ".");
			break;
		default:
			System.out.println("Operation not avaialable in the system");

		}
		System.out.println("more code...");
		System.out.println("exit...");
		input.close();

	}
}
