package HWD9;

import java.util.Scanner;

public class Q16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter any integer of your choice:");
		int num1 = input.nextInt();
		if (num1 % 2 == 0) {
			System.out.println("The given number " + num1 + " is even.");
		} else {
			System.out.println("The given number " + num1 + " is odd.");
		}
		input.close();
	}
}
