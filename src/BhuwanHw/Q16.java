package BhuwanHw;

import java.util.Scanner;

public class Q16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of stars you want for the pattern vertically:  ");
		int star = input.nextInt();
		for(int i=1;i<=star;i++){
	        for(int j=1;j<=star;j++) {
	        	if (i==1 || j==star||i==j) {
	        		System.out.print("*");
	        	}
	        	else {
	        		System.out.print(" ");
	        	}
	        }
	        System.out.println();       
	    }
		
	}
}
		
	

