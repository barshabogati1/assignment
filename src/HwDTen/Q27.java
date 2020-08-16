//27.	Write a Program to sum each digit of 
//given number as well as product. //456 =>4*5*6
//and 4+5+6
package HwDTen;

import java.util.Scanner;

public class Q27 {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n = input.nextInt();
	int remainder;
	int sum=0;
	int product =1;
	
	while (n!= 0) {
		remainder = n %10;
		sum = sum + remainder;
		product= product*remainder;
		n=n/10;
			
	}
	System.out.println("the rquired sum is "+ sum);
	System.out.println("the rquired prooduct is "+ product);
	
}
}

