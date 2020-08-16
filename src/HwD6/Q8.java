//8.	Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.

package HwD6;

import java.util.Scanner;

public class Q8 {
public static void main(String[] args) {
	 Scanner input = new Scanner (System.in);
	 System.out.println("Please enter the temperature in Fahrenheit: ");
     double temp_F= input.nextDouble();
     double temp_C= ((temp_F-32)*5)/9;
     System.out.println("The required temperature in celisus is: "+temp_C);
     
     //**********************************************************************//
     
     System.out.println("Please enter the temperature in Celcius: ");
     double temp_c= input.nextDouble();
     double temp_f= ((temp_c*9)/5)+32;
     System.out.println("The required temperature in Fahrenheit is: "+temp_f);
     
     input.close();
     
     
     
}
}
