import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOddEven {
	public static void main(String args[]) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<Integer> evenList = numbers.stream().filter(e -> e%2==0).collect(Collectors.toList());
		int evenSum = numbers.stream().filter(e -> e%2==0).mapToInt(Integer::intValue).sum();
		System.out.println(evenList);
		System.out.println(evenSum);

		List<Integer> oddList = numbers.stream().filter(e -> e%2!=0).collect(Collectors.toList());
		int oddSum = numbers.stream().filter(e -> e%2!=0).mapToInt(Integer::intValue).sum();
		System.out.println(oddList);
		System.out.println(oddSum);
		
		int totalSum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Total sum: " + totalSum);
		
		// multiples of 5
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		List<Integer> mulFive = listOfIntegers.stream().filter(e -> e%5 ==0).collect(Collectors.toList());
		System.out.println(mulFive);
		
		
		// First 10 odd numbers
		System.out.println("First 10 odd numbers:");
        Stream.iterate(new int[] {1, 3}, f -> new int[] {f[1], f[1]+2})
                .limit(10)
                .map(f -> f[0])
                .forEach(i -> System.out.print(i+" "));
	}
}
