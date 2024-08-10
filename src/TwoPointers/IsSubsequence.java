package TwoPointers;
/**
 * 392. Is Subsequence
 */
public class IsSubsequence {

	public static void main(String[] args) {
		String s = "acb";
		String t = "ahbgdcb";
		
		int sPointer = 0;
		int tPointer = 0;
		
		if (s.length() > t.length()) {
			System.out.println("false");
		}
		while (sPointer < s.length()) {
			if (tPointer == t.length()) {
				System.out.println("false");
				break;
			}
			
			if (s.charAt(sPointer) == t.charAt(tPointer)) {
				sPointer++;
				tPointer++;
			} else if (s.charAt(sPointer) != t.charAt(tPointer)) {
				tPointer++;
			}
		}
		System.out.println("true");
	}

}
