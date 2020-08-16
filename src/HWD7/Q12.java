//12.12.	Write a program to accept the roll, name, and
//nationality of the person and display those values in good format way.

package HWD7;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the roll of the person: ");
		int a = input.nextInt();
		input.nextLine();
		System.out.println("Please enter the name of the person: ");
		String name = input.nextLine();
		System.out.println("Please enter the nationality of the person: ");
		String nationality = input.nextLine();
		
		System.out.println("The name of the person is: " + name+ " with tha ntionality "+nationality+" and the roll is " +a);
input.close();
	}
}
