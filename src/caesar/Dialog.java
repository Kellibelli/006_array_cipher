package caesar;

import javax.swing.JOptionPane;

public class Dialog {
	
	private Object[] cipherOptions = {"Encode", "Decode", "Crack", "Exit"};
	private String inputMessage, option;
	CaesarCipher c = new CaesarCipher();
	
	public Dialog () {
		run();
	}
	
	private void runOption () {
		boolean valid = false;
		while (!valid) {
			switch (option) {
			case "Encode":
				String e = Stitch.input("What is the key to encode the message?");
				c.encode(inputMessage, Integer.parseInt(e));
				valid = true;
				break;
			case "Decode":
				String d = Stitch.input("What is the key to decode the message?");
				c.decode(inputMessage, Integer.parseInt(d));
				valid = true;
				break;
			case "Crack":
				c.crack(inputMessage);
				valid = true;
				break;
			case "Exit":
				Stitch.text("Thanks for using my program! Goodbye!");
				valid = true;
				System.exit(0);
			default: 
				Stitch.text("Invalid, try again.");
				valid = false;
				break;
			}	
		}		
	}
	
	private void run () {
		boolean runAgain = true;
		String[] options = {"Yes", "No"};
		while (runAgain) {
			option = (String) Stitch.choice("Pick Caesar Cipher option", "What do you want to do with the message?", cipherOptions, 0);
			inputMessage = Stitch.input("What is the message you want to work with?");
			runOption();
			int userChoice = JOptionPane.showOptionDialog(null, "Would you like to go again?", "Run again", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			if (userChoice == 0) {
				runAgain = true;
			}
			else if (userChoice == 1) {
				runAgain = false;
			}
		}
		Stitch.text("Thanks for using my program! Goodbye!");
	}
}