import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		
		String str = "developer";
		
		List<String> items = Arrays.asList(str.split(""));
//		
		System.out.println("Actual String: " + str);
		
//		Set<String> dup = items.stream().filter(e -> Collections.frequency(items,e)>1).collect(Collectors.toSet());
		
		// Create a map of (character, countOfCharacter) 
		//		-> create a set out of this map -> stream -> filter out entries with value > 1 -> map entry to the key(char) -> get the first char
        Map<String, Long> charCountMap = 
                items.stream()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        String firstRepeatedChar = charCountMap.entrySet()
                                    .stream()
                                    .filter(entry -> entry.getValue() > 1)
                                    .map(entry -> entry.getKey())
                                    .findFirst()
                                    .get();

        System.out.println("First repeated character: " + firstRepeatedChar);
		
//		System.out.println("set items: "+ dup);
//		System.out.println("First repeated character: " + dup.iterator().next());
		
		
		// Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter
		
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        System.out.println(listOfStrings);
        String joinedString = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));
         
        System.out.println("Joined String: " + joinedString);

		
	}
}
