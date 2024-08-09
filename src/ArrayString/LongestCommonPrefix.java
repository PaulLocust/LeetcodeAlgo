package ArrayString;

/**
 * 14. Longest Common Prefix
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		System.out.println(solution(strs));
		
		
	}
	
	public static String solution(String[] strs) {
		String minStr = "";
		int minLength = Integer.MAX_VALUE;
		for (String str: strs) {
			if (str.length() < minLength) {
				minLength = str.length();
				minStr = str;
			}
		}
		
		int i = minLength;
		while (true) {
			
			for (int j = 0; j < strs.length; j++) {
				if (!strs[j].substring(0, i).equals(minStr.substring(0,i))) {
					i--;
					break;
				} else if (strs[j].substring(0, i).equals(minStr.substring(0,i)) && j == strs.length-1) {
					return minStr.substring(0,i);
				}
			}
		}
	}
}


