package BhuwanHw;

public class Q6 {
	public static void main(String[] args) {
		int star = 5;
		for (int i =1; i <=5;) {
			if (star >i)
			{
				System.out.print(" ");
				star--;
			}
			if ( star== i)
			{
				System.out.print("*");
				i++;
				star =5;
				System.out.println();
			}
		}
	}
	

}
