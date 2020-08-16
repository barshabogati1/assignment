package HWD9;

import java.util.Scanner;

public class Q18 {
public static void main(String[] args) {
	Scanner input= new Scanner (System.in);
    System.out.println("Please enter any integer of your choice:");
    int num1 = input.nextInt();
    System.out.println("Please enter any integer of your choice:");
    int num2 = input.nextInt();
    System.out.println("Please enter any integer of your choice:");
    int num3 = input.nextInt();
    if (num1 > num2 && num1 > num3)
    {System.out.println("The number "+num1+" is the highest.");
    
    }
    else if (num2 > num1 && num2> num3)
     {System.out.println("The number "+num2+" is the highest.");
     
     }
    else if (num3 > num1 && num3> num2)
    {System.out.println("The number "+num3+" is the highest.");
    
    }
    input.close();
}
}
