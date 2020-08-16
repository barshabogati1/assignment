//25.	Write a program that prompts the user to enter the number of students and each student’s name and score
//Finally display the student with
//highest score.
package HwDTen;

import java.util.Scanner;

public class Q25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maxScore =0;
		String studentName = " ";
		System.out.println("Please enter the total number of students?");
		int num = input.nextInt();
		for(int i=1; i<=num ;i++) {
			System.out.println("Enter the student name");
			String name= input.next();
	        System.out.println("Enter the student score");
	        int score= input.nextInt();
	        if(score > maxScore) 
	        	maxScore= score;
	            studentName = name;
		}
		
			
			System.out.println("The highest scorer name is "+ studentName +" and the score is "+ maxScore);
		}
        
	
		
	}

