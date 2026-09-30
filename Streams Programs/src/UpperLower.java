import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Convert Strings to Upper and Lower cases
public class UpperLower {

	public static void main(String args[]) {
		List<String> colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
		
		List<String> upper = colors.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upper);
		
		List<String> lower = colors.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(lower);
	}
}
