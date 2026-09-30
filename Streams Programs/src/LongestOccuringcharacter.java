import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestOccuringcharacter {

	public  static void main(String args[]) {
		
		String str = "aabbbbbcc";
		// Convert to stream and save in map(char, count). 
		// Convert Map -> Set ==> Stream ==> find the max by value of count & save in map ==> get the Map with char and count
		List<String> lst = Arrays.asList(str.split(""));
		Map.Entry<String,Long> max = lst.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet()
        .stream()
        .max(Map.Entry.comparingByValue())
        .get();
		
		System.out.println(max);
		
	}
}
