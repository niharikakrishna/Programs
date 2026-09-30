package Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class WiproRegex {
	
	public static boolean regexMatch(String s, String p) {
		
//		Compile the regex pattern
		Pattern pattern = Pattern.compile(p);
		
//		Create a matcher for the input string
		Matcher matcher = pattern.matcher(s);
		
//		Check if the entire string matches the pattern
		return matcher.matches();
	}
	
	public static void main(String args[]) {
		System.out.println(regexMatch("abcde", "a.*e"));
	}
}
