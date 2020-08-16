//5.	Write a program to find the area of circle, rectangle, and triangle.
package HwD6;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		double pi= 3.14;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the radius of the circle: ");
		int r = input.nextInt();
		double area_circle= pi*r*r;
		System.out.println("Area of the circle is: "+area_circle);
		//*****************************************************************//
        System.out.println("Please enter the length of the ractangle");
        int l= input.nextInt();
        System.out.println("Please enter the breadth of the ractangle");
        int b= input.nextInt();
        double area_rectangle= 0.5*l*b;
        System.out.println("Area of the rectangle is: "+area_rectangle);
		//*****************************************************************//
        System.out.println("Please enter the height of the triangle");
        int h= input.nextInt();
        System.out.println("Please enter the breadth of the ractangle");
        int b_t= input.nextInt();
        double area_triangle= 0.5*h*b_t;
        System.out.println("Area of the rectangle is: "+area_triangle);
        input.close();
        
        
	}
}
