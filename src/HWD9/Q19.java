package HWD9;

import java.util.Scanner;

public class Q19 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter length of side a of triangle");
		int a = input.nextInt();
		System.out.println("Please enter length of  side b of triangle");
		int b = input.nextInt();
		System.out.println("Please enter length of  side c of triangle");
		int c = input.nextInt();

		if (a == b && a == c) {
			System.out.println("The given triangle is equilateral triangle");
		} else if (a == b || a ==c ||  b == c) {
			System.out.println("The given triangle is isosceles triangle");

		}

		else if (a != b && a != c) {
			System.out.println("The given triangle is scalene triangle");
		}
		input.close();

	}
}
