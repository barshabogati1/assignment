//23.	Write a Program to sum 1 to nth natural numbers.
package HwDTen;

import java.util.Scanner;

public class Q23 {
	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.println("Enter nth number: ");
		int n = input.nextInt();
		int sum=0;
		
		for(int i=1; i<=n;i++ ) {
			sum = sum + i;
			System.out.println("The required sum is: "+sum+".");
		}
		System.out.println("Exit from loop");
		input.close();
		
	}

}
