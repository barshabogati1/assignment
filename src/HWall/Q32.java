//32.	Write a Program to accepts 5 values in array and display their sum.
package HWall;

import java.util.Scanner;

public class Q32 {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
	
		int [] arr = new int [5];
		for (int i=0;i<arr.length; i++) {
			System.out.println("Please enter the five elemnet: ");
			arr[i]= input.nextInt();
			
		}
		

	int sum =0;
	for(int i=0;i<arr.length; i++) {
	System.out.println("The input elements are "+ arr[i]);	
	sum = sum+ arr[i];

	}
	System.out.println(" The requires sum is "+ sum);
	input.close();
	}

}
