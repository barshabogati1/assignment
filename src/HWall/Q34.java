// 34.	Write a program to reverse the element of an array.
package HWall;

import java.util.Scanner;

public class Q34 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please ente the number of array you want: ");
		int count= input.nextInt();
		
		int arr [] = new int [count];
		int arr1[] = new int [count];
	
		for ( int i=0; i<count;i++) {
			System.out.println("Please enter your array  elements:");
			arr[i]= input.nextInt();
	
		}
			
			for (int i =0; i< count ;i++) {
				arr1[i]=arr[count-1-i];
			
			}	
			System.out.println("The required reverse array is ");
	for (int i =0; i<count;i++) {
		System.out.println("\n"+arr1[i]);
	}
						
		input.close();		
	
	}

}
