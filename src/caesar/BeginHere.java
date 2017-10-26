package caesar;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BeginHere {

	public static void main(String[] args) {
		String msg = "Would you like to encode a plain text message?";
		int confirm = JOptionPane.showConfirmDialog(null, msg);
		Scanner kbd = new Scanner(System.in);
		
		CaesarCipher myCipher = new CaesarCipher();
		
		
		//if statement
		
		System.out.println("Please enter the plain text to encode:");
		String plainText = kbd.nextLine().toLowerCase();

		System.out.println("Please enter the key:");
		int key = kbd.nextInt();

		String codedText = myCipher.encode(plainText, key);
		System.out.println("Your secret message is: " + codedText);

	}

}
