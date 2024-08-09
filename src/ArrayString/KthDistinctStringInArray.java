package ArrayString;

import java.util.HashMap;

/*
 * 2053. Kth Distinct String in an Array
 */
public class KthDistinctStringInArray {
	public static void main(String[] args) {
		
		String[] arr = {"d","b","c","b","c","a"};
		int k = 2;
		HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i=0; i < arr.length; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }
        
        int iterator = 1;
        String ans = "";
        for (String str: arr) {
            if (hashMap.get(str) == 1 && iterator == k) {
                ans = str;
                break;
            } else if (hashMap.get(str) == 1 && iterator != k){
            	iterator++;
            }
        }
        System.out.println(ans);
	}
}
