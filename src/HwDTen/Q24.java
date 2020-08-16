//24.	Write a program to print the factorial number of given numbers.
package HwDTen;

import java.util.Scanner;

public class Q24 {
public static void main(String[] args) {
	Scanner input =new Scanner (System.in);
	System.out.println("Enter any number: ");
	
	int n = input.nextInt();
	int fact =1;
	for(int i=n; i<=n && i>0;i--) {
		 fact= fact*i;
		
	}
	System.out.println("The factorial is "+fact);
	input.close();
}
}
