package HWD9;

import java.util.Scanner;

public class Q14 {
public static void main(String[] args) {
	Scanner input= new Scanner (System.in);
    System.out.println("Please enter any integer of your choice:");
    int num1 = input.nextInt();
    System.out.println("Please enter any integer of your choice:");
    int num2 = input.nextInt();
    
    
    if (num1 == num2)
    {System.out.println("The numbers "+num1+ " and "+num2+" are equal.");
    }
    else if (num1 < num2 || num1 > num2)
    {System.out.println("The numbers "+num1+ " and "+num2+" are not equal.");
    }
    input.close();
}
}
