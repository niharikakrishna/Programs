import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MinMax {
	
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);
		
		int min = list.stream().min(Comparator.comparing(Function.identity())).get();
		System.out.println(min);
		
		
		int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
	}
}