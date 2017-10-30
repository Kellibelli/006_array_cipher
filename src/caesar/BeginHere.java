package caesar;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BeginHere {

	public static void main(String[] args) {
		Object[] selectionsArray = { "Encoder", "Decoder", "Cracker", "Exit" };
		String showFirst = "Encoder";
		String selection = (String) JOptionPane.showInputDialog(
				null, 
				"Message: Select a Utility: ",
				"Title: Doug's Example", 
				JOptionPane.PLAIN_MESSAGE, 
				null, 
				selectionsArray, 
				showFirst);
				if (selection == null) selection = "Cancelled";// .equals doesn't work, null is not a String
				JOptionPane.showMessageDialog(null, "You have selected: " + selection);

				switch (selection) { // switch on String allowed in Java 7 and higher
				case "Encoder":
					JOptionPane.showMessageDialog(null, 
							"We are now in the Encoder switch block - add some code!");
					break;
					//break means all done, leave the switch block - almost always use break
					//if no break, execution continues for all remaining cases
				case "Decoder":
					JOptionPane.showMessageDialog(null, 
						"We are now in the Decoder switch block - add some code!");
					break;
				case "Cracker":
					JOptionPane.showMessageDialog(null, 
						"We are now in the Cracker switch block - add some code!");
					break;
				case "Exit":
					JOptionPane.showMessageDialog(null, 
						"We are now in the Exit switch block - so add some code already to get us out of here!");
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null, 
						"Ok goodbye then!");
					System.exit(0);
		}
		//after the 'break' continue with the following code
		//Scanner kbd = new Scanner(System.in);
		CaesarCipher myCipher = new CaesarCipher();
		
		
		
		//System.out.println("Please enter the plain text to encode:");
		//String plainText = kbd.nextLine().toLowerCase();
		
		//JOptionPane.showMessageDialog(null, "Please enter the plain text to encode:");
		String plainText = JOptionPane.showInputDialog("Please enter plain text").toLowerCase();
		JOptionPane.showMessageDialog(null, "You have entered this for plain text: " + plainText);

		//System.out.println("Please enter the key:");
		int key = Integer.parseInt( JOptionPane.showInputDialog("Please enter the key:"));
		//int key = kbd.nextInt();
		JOptionPane.showMessageDialog(null, "You have entered this for your key: " + key);

		String codedText = myCipher.encode(plainText, key);
		JOptionPane.showMessageDialog(null, "Your secret message is: " + codedText);
		//System.out.println("Your secret message is: " + codedText);

	}

}
