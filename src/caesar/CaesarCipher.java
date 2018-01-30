package caesar;

public class CaesarCipher {
	
	private  String alpha = "abcdefghijklmnopqrstuvwxyz0123456789.:'";
	
	int index, keyAdded;
	
	public void encode (String plainText, int key) {
		
		String encodedWord = "";
		
		for (int i = 0; i < plainText.length(); i++) {
			index = alpha.indexOf(plainText.charAt(i));
			keyAdded = (index + key) % alpha.length();
			encodedWord+=alpha.charAt(keyAdded);
		}
		Stitch.text("The secret message is: " + encodedWord);
	}
	public void decode (String plainText, int key) {
		
		String decodedWord = "";
		
		key = key % alpha.length();
		
		for (int i = 0; i < plainText.length(); i++) {
			index = alpha.indexOf(plainText.charAt(i));
			
			keyAdded = index - (key % alpha.length());
			if (keyAdded < 0) {
				keyAdded = alpha.length() + keyAdded;
			}
			decodedWord+=alpha.charAt(keyAdded);
		}
		Stitch.text("The secret message is: " + decodedWord);
	}
	public void crack (String plainText) {
		String keyWord = "";
		String temp = "Possible decoding keys:\n";
		
		for (int key = alpha.length() - 1; key >= 0; key--) {
			key = key % alpha.length();
			
			for (int i = 0; i < plainText.length(); i++) {
				index = alpha.indexOf(plainText.charAt(i));
				
				keyAdded = index - (key % alpha.length());
				if (keyAdded < 0) {
					keyAdded = alpha.length() + keyAdded;
				}
				keyWord+=alpha.charAt(keyAdded);
			}
			temp += key + ": " + keyWord + "\n";
			keyWord = "";
		}
		
		Stitch.text(temp);
	}
}