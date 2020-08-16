package HWD9;

import java.util.Scanner;

public class Q17 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter any leap year of your choice:");
	int num1 = input.nextInt();
	if (num1 % 4 == 0) {
		System.out.println("The given number " + num1 + " is leap year.");
	} else {
		System.out.println("The given number " + num1 + " is not a leap year.");
	}
	input.close();
}
}
