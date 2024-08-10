package TwoPointers;
/**
 * 125. Valid Palindrome
 */
public class ValidPalindrome {
	
	public static void main(String[] args) {
		String s = "0P";
		s.toLowerCase();
		char[] charArr = s.toCharArray();
		StringBuilder builder = new StringBuilder();
		for (char c: charArr) {
			if (Character.isLetter(c) || Character.isDigit(c)) {
				builder.append(c);
			}
		}
		String readyString = builder.toString();
		int leftFlag = 0;
		int rightFlag = readyString.length()-1;
		
		while (leftFlag < rightFlag) {
			if (readyString.charAt(leftFlag) == readyString.charAt(rightFlag)) {
				leftFlag++;
				rightFlag--;
			} else {
				System.out.println("false");
				break;
			}
		}
		System.out.print("true");
	}

}
