import java.util.Arrays;
import java.util.List;

public class Avg {
	public static void main(String args[]) {
		List<Integer> nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
		
		Double avg = nums.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println(avg);
	}
}
