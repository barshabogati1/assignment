//4.	Write a program to calculate Simple Interest input by user. Simple Interest = P*T*R/100

package HW_D2;

import javax.swing.JOptionPane;

public class Q4 {
	public static void main(String[] args) {
		int P = Integer.parseInt(JOptionPane.showInputDialog("Please, Enter the amount of Principle:"));
		int T = Integer.parseInt(JOptionPane.showInputDialog("Please, Enter the length of Time:"));
		int R = Integer.parseInt(JOptionPane.showInputDialog("Please, Enter the percentage of rate:"));
		int S_I = (P * T * R) / 100;
		JOptionPane.showConfirmDialog(null,"The simple interest calculated with the principle of amount "+P+" , time of length "
				+T+ " and rate of percentage "+R+ " is "+ S_I);

	}

}
