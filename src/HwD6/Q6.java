//6.	Write a program to find the perimeter of circle, triangle, and rectangle
package HwD6;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		
		double pi = 3.14;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the radius of the circle: ");
		int r = input.nextInt();
		double perimeter_circle = 2 * pi * r;
		System.out.println("Perimeter of the circle is: " + perimeter_circle);
		
		
		// *****************************************************************//
		
		
		System.out.println("Please enter the length of the ractangle");
		int l = input.nextInt();
		System.out.println("Please enter the breadth of the ractangle");
		int b = input.nextInt();
		int perimeter_rectangle = 2 * (l + b);
		System.out.println("Perimeter of the rectangle is: " + perimeter_rectangle);
		
		
		// *****************************************************************//
		
		
		System.out.println("Please enter the length of side a of the  triangle");
		int side_a = input.nextInt();
		System.out.println("Please enter the length of side b of the ractangle");
		int side_b = input.nextInt();
		System.out.println("Please enter the length of side c of the  triangle");
		int side_c = input.nextInt();
		int perimeter_triangle = side_a + side_b + side_c;
		System.out.println("Perimeter of the rectangle is: " + perimeter_triangle);
		
		
		input.close();
	}
}
