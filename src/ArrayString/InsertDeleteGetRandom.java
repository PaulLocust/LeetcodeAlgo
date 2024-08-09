package ArrayString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertDeleteGetRandom {
	/*
	 * 380. Insert Delete GetRandom O(1) Решил ArrayList
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomizedSet rs = new RandomizedSet();
		System.out.println(rs.insert(1));
		System.out.println(rs.insert(2));
		System.out.println(rs.insert(1));
		System.out.println(rs.remove(5));
		System.out.println(rs.getRandom());
	}

}

class RandomizedSet {
	List<Integer> arrList;
	int arrLength = 0;
	
    public RandomizedSet() {
    	arrList = new ArrayList<>();
    }
    
    public boolean insert(int val) {
		if (arrList.contains(val)) {
			return false;
		} else {
			arrList.add(val);
			arrLength += 1;
		}
    	return true; 
    }
    
    public boolean remove(int val) {
		
    	if (!arrList.contains(val)) {
			return false;
		} else {
			arrList.remove(arrList.indexOf(val));
			arrLength -= 1;
		}
    	return true; 
        
    }
    
    public int getRandom() {
    	int randomIndex = (int) (Math.random() * arrLength);
    	return arrList.get(randomIndex);
        
    }
}