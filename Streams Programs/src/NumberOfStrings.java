import java.util.Arrays;
import java.util.List;

//Count Strings Starting with Specific Letter using Streams

public class NumberOfStrings {
	public static void main(String[] args) {
		
	    List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown", "Burgundy", "Maroon");
	    char startingLetter = 'B';
	    
	    long count = colors.stream().filter(e -> e.startsWith(String.valueOf(startingLetter))).count();
	    
	    System.out.println(count);
	}
}
