//22.	Write a program to print the table of given number.
package HwDTen;

import java.util.Scanner;

public class Q22 {
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		System.out.println("Enter any number that you want table of: ");
		int n= input.nextInt();
		
		for(int i=1;i<=10 ;i++) {
			
			System.out.println("The multiplication of "+n +"*" +i+ " is " +n*i);
		}
		input.close();
	}

}
