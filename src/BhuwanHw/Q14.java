package BhuwanHw;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of stars you want for the pattern vertically:  ");
		int star = input.nextInt();
		  for (int i= 0; i<= star-1 ; i++)
	        {
	            for (int j=0; j <i; j++)
	            {
	                System.out.print(" ");
	            }
	            for (int k=i; k<=star-1; k++) 
	            {
	            System.out.print("*" + " ");
	            } 
	            System.out.println("");
	            } 
	            for (int i= star-1; i>= 0; i--)
	        {
	            for (int j=0; j< i ;j++)
	            {
	                System.out.print(" ");
	            }
	            for (int k=i; k<=star-1; k++)
	            {
	                System.out.print("*" + " ");
	            }
	            System.out.println("");
	        }
	        input.close();
		
}
}

