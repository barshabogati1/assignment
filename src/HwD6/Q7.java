// 7.	Write a program that read the radius and length of a cylinder and computes volume.
package HwD6;

import java.util.Scanner;

public class Q7 {
public static void main(String[] args) {

	double pi = 3.14;
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the radius of the cylinder: ");
	int r = input.nextInt();
	System.out.println("Please enter the length of the cylinder: ");
	int l = input.nextInt();
	double Volume = 2 * pi * r *l;
	System.out.println("Volume of the cylinder is: " + Volume);
	
	input.close();
}
}
