//9.	Write a program that converts pounds into kg. The program prompts the user to enter number of pounds, 
//converts it to kg and displays the result [1 pound is 0.454 kg].
package HwD6;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the weight in pounds:");
		double Weight_p = input.nextDouble();
		double Weight_kg = Weight_p * 0.454;
		System.out.println("The required conversion of weight from pound to kg is : " + Weight_kg + "kg");

		input.close();
	}
}
