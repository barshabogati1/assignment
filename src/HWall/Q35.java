//35.	Write a function to find second largest number in given array.
package HWall;

import java.util.Scanner;



public class Q35 {
	public static void main(String[] args) {
		int temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Please ente the number of array you want: ");
		int count = input.nextInt();

		int arr[] = new int[count];
		int arr1[] = new int[count];

		for (int i = 0; i < count; i++) {
			System.out.println("Please enter your array  elements:");
			arr[i] = input.nextInt();

		}
		for (int i = 0; i < count; i++) {
			for (int j = i+1; j <count ; j++) {
				if (arr[j] > arr[i]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}

			}

		}
		System.out.println("Descending order:");
		for (int i = 0; i <= count-1; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("The second largets number is "+arr[1]);
		input.close();
		
	}
	
	

}
