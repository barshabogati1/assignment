//3.	Write a program to find sum and average of two numbers input by User (using Scanner class)

package HW_D2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		int a = input.nextInt();
		System.out.println("Please enter the second number:");
		int b = input.nextInt();
		
		int sum=a+b;
		int avg= (a+b)/2;
		
		System.out.println("The sum of "+a+ " and "+b+ " is "+sum);
		System.out.println("The average of "+a+ " and "+b+ " is "+ avg);
		input.close();
		

	}
}
