//33.	Write a Program to display number in ascending order in array.
package HWall;

import java.util.Scanner;

public class Q33 {
	
	public static int[] ascendingArray(int count , int arr[]) {
		for (int i = 0; i < count; i++) {
			
			for (int j = i + 1; j < count; j++) 
			{
				if (arr[i] > arr[j]) 
				{ int temp;
				   temp= arr[i];	
				   arr[i]=arr[j];
				   arr[j]=temp;
				}

			}

		}
			
	return arr;
	}
	public static void printInfo(int [] arr1, int count) {
		System.out.print("Array Elements in Ascending Order: ");
        for ( int i = 0; i <  count; i++) 
        {
            System.out.print("\n"+  arr1[i]);
        }
		
	}
	public static void main(String[] args) {
		int i;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The number of elements ");
		int count = input.nextInt();

		int[] arr = new int[count];
		System.out.println("Please enter the elements: ");
		for (i = 0; i < count; i++) {
			arr[i] = input.nextInt();
		}
		int[] arr1 = new int[count];
		arr1 = ascendingArray(count,arr);
		printInfo(arr1,count);
		
		
		
      
	}

}
