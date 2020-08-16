//28.	Write a program in single class having the following functions.
//a.	isPrimenumber(int)

package HwD11;

import java.util.Scanner;

public class Q28 {
	public static boolean primeNum() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter any number: ");
		int  a = input.nextInt();
		int temp;
		for (int i=2; i>= a ;i++) {
			temp =a%i;
			if(temp==0) {
				
				boolean primeNum = true;
			}
			else {
				boolean primeNum=false;
			}
		}
		return 
	}
	
	
	public static void main(String[] args) {
		Q28 obj = new Q28();
		obj.primeNum();
		//System.out.println("The given number is a prime number "+ );
		
	}
}
