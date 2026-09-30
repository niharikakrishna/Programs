package Programs;

import java.util.Arrays;

public class Pangram {

	public static void main(String args[]) {
		String str = "The quick Brown 2 fox jumps Over a Lazy Dog";
		boolean val = isPangram(str);
		if(val)
			System.out.println(str + " is a Pangram");
		else
			System.out.println(str + " is not a Pangram");
	}
	
	public static boolean isPangram(String string) {
	    string = string.replace(" ","");
	    string  = string.toUpperCase();
	    char y[] = string.toCharArray();
	    Arrays.sort(y);
	    for(char i='A'; i<='Z'; i++){
	        int result= Arrays.binarySearch(y,i);
	        if(result < 0) 
	        return false;
	    }
	    return true;
	    
	}
	// Solution 2 - https://youtu.be/S7iMdaA_-Gg?si=f9UpzcBXBZvGOUUM&t=980
}
