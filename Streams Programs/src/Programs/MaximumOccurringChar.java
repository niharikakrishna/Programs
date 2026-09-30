package Programs;
import java.util.*;

public class MaximumOccurringChar {
	
	// function that returns maximum occurring character
	static Map<String,Object> getMaxOccurringChar(String str) {
		
		// create HashMap to store frequency of every character
		HashMap<Character, Integer> mp = new HashMap<>();
		
		// to store length of string
		int n = str.length();
		
		// to store answer 
		char ans = 0;
		
		// to check count of answer character is less or greater
		// than another elements count
		int cnt = 0;
		
		// traverse the string 
		for(int i = 0; i < n; i++) {
			
			// push element into map and increase its frequency 
			char c = str.charAt(i);
			mp.put(c, mp.getOrDefault(c, 0) + 1);
			
			// update answer and count
			if(cnt < mp.get(c)) {
				ans = c;
				cnt = mp.get(c);
			}
		}
		
		Map<String,Object> map = new HashMap<>();
		map.put("count", cnt);
		map.put("maxChar", ans);
		return map;
	}

	// Driver Code
	public static void main(String[] args) {
		String str = "aabbbbbcc";
		Map<String,Object> map = getMaxOccurringChar(str);
		char maxChar = (char) map.get("maxChar");
		int count = (int) map.get("count");
		System.out.println("Max occurring character is: " + maxChar);
		System.out.println("No. of times the character occurs in string: " + count);
		System.out.println("Index of max occurring character is: " + str.indexOf(maxChar));
	}
}

// This code is contributed by kalyanbef
