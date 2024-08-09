package ArrayString;

/**
 * 58. Length of Last Word
 */
public class LengthOfLastWord {

	public static void main(String[] args) {

		String str = "Hello World ";
		String[] words = str.split(" ");
		int maxIndex = words.length - 1;
		System.out.println(words[maxIndex].length());

	}

}
