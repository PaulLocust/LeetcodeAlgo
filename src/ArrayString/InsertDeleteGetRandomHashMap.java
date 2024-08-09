package ArrayString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InsertDeleteGetRandomHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomizedSetHashMap rs = new RandomizedSetHashMap();
		System.out.println(rs.remove(0));
		System.out.println(rs.remove(0));
		System.out.println(rs.insert(0));
		System.out.println(rs.getRandom());
		System.out.println(rs.remove(0));
		System.out.println(rs.insert(0));
		System.out.println(rs.getRandom());
		
		System.out.println(rs.getMap().toString());
		int arrLength = rs.getLength();
		System.out.println(arrLength + "sadasd");
		/**for (int i = 0; i < 20; i++) {
			System.out.println((int) (Math.random() * arrLength-1) + 1);
		}*/
	}
}

class RandomizedSetHashMap {
	HashMap<Integer, Integer> hashMap;
	int arrLength = 1;
		
	public RandomizedSetHashMap() {
	    hashMap = new HashMap<>();
	}
	    
	public boolean insert(int val) {
		if (hashMap.containsValue(val)) {
			return false;
		} else {
			hashMap.put(arrLength, val);
			arrLength += 1;
		}
	   	return true; 
	}
	    
	public boolean remove(int val) {
			
		if (!hashMap.containsValue(val)) {
			return false;
		} else {
			hashMap.remove(hashMap.get(arrLength));
			arrLength -= 1;
		}
	    return true; 
	        
	}
	    
	public int getRandom() {
		if (arrLength == 1) {
			return hashMap.get(1);
		}
	    int randomIndex = (int) (Math.random() * arrLength-1) + 1;
	    return hashMap.get(randomIndex);
	        
	}
	
	public HashMap<Integer, Integer> getMap() {
		return hashMap;
	}
	public int getLength() {
		return arrLength;
	}
}

