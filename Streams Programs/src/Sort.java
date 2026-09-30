import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
	
	public static void main(String args[]) {
		//Integer
		List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);
		
		List<Integer> ascSort = list.stream().sorted().collect(Collectors.toList());
		System.out.println(ascSort);
		
		List<Integer> descSort = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(descSort);
		
		//String
		List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
		
		//asc
		List<String> ascColors = colors.stream().sorted().collect(Collectors.toList());
		System.out.println(ascColors);
		
		//desc
		List<String> descColors = colors.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(descColors);
		
//		NOTE - We can use Comparator.reverseOrder() instead of Collections.reverseOrder()
//		https://stackoverflow.com/questions/61178553/comparator-reverseorder-vs-collections-reverseorder#:~:text=10,at%2016%3A26
	}
}