package caesar;

import javax.swing.JOptionPane;

public class Stitch {

	public static void main(String[] args) {
		Dialog d = new Dialog();
	}
	
	public static void text (String message) {
		JOptionPane.showMessageDialog(null, message); 
	}
	
	public static String input (String message) {
		return JOptionPane.showInputDialog(null, message);
	}
	
	public static Object choice (String title, String message, Object[] options, int startIndex) {
		
		return JOptionPane.showInputDialog(null, message, title,
		JOptionPane.INFORMATION_MESSAGE, null, options, options[startIndex]);
	}
}