/*15.	Write a program that receives an ASCII code (between 0 – 128) and display its character 
 * [example: 97 (input) ->a(output)].
 */
package HWD9;

import java.util.Scanner;

public class Q15 {
public static void main(String[] args) {
Scanner a = new Scanner (System.in);
/*
 * System.out.println("Please, enter any ASCII code from 0-128");
 
int ascii_num = a.nextInt();
if (ascii_num >= 0 && ascii_num<=128)
{
	System.out.println("The ASCII code of "+ascii_num+ " is " + (char) ascii_num);
	a.close();
}
*/
System.out.println("Please enter any charcater");
char ch = a.next().charAt(3);
int b = ch;
System.out.println("The required balue of the charcter is "+b);


}
}
