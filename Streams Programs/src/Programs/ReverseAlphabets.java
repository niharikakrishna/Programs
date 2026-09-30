package Programs;

import java.util.stream.Collectors;

// WAP to reverse the alphabets by keeping the special characters at the same position
public class ReverseAlphabets {
	public static void main(String args[]) {
		String str = "S!$d@ram";
		
		// Extract only letters
		String letters = str.chars()
							.mapToObj(c -> String.valueOf((char) c))
							.filter(s -> Character.isLetter(s.charAt(0)))
							.collect(Collectors.joining());
		
		// Reverse the letters
		String rev = new StringBuilder(letters).reverse().toString();
		
		StringBuilder result = new StringBuilder();
		
		int index = 0;
		
		for (char c : str.toCharArray()) {
			if(Character.isLetter(c)) {
				result.append(rev.charAt(index++));
			} else {
				result.append(c);
			}
		}
		System.out.println("Input: " + str);
		System.out.println("Output: " + result);
	}
}
