package HWD9;

import java.util.Scanner;

public class Q13 {
	public static void main(String[] args)
	{
    Scanner input= new Scanner (System.in);
    System.out.println("Please enter any negative number of your choice:");
    double num = input.nextDouble();
    if (num < 0){
    System.out.println("The negative number you entered is "+ num);}
    else {
    System.out.println("This is not a negative number"); 
    }
    System.out.println("more code");
	System.out.println("exit");
	input.close();
	}
}
