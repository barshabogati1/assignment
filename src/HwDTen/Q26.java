//26.	Write a Program to reverse the given number. //123 => 321
package HwDTen;

import java.util.Scanner;

public class Q26 {
	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.println("Enter a number to reverse: ");
		
		int n = input.nextInt();
		int reverse =0;
		int remainder;
		//542
		while (n!=0) {
			remainder=n %10 ;//2//4//5
			reverse=reverse*10+remainder;//2//4//5
			n=n/10;//54/5/0
				
		}
		System.out.println("The reverse of the given number is:"+reverse);
		input.close();
	}

}
