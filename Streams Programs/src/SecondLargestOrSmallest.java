import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestOrSmallest {
	public static void main(String args[]) {
		List<Integer> nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
		
		//secondSmallest
		int secondSmallest = nums.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secondSmallest);
		
		//secondHighest
		int secondHighest = nums.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secondHighest);
		
		//reverseOrder of decimals
       List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
         
       List<Double> revList = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
       System.out.println("Reversed decimal list: " + revList);
       
       //Min and Max 3 numbers
       
       List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        
       System.out.println("--------------------------------------------------------------------------");
       System.out.println(listOfIntegers);
       System.out.println("Minimum 3 Numbers");
       listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);
        
       System.out.println("Maximum 3 Numbers");
       listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
	}
}
