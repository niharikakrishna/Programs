import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfListElements {
	public static void main(String args[]) {
    List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
    
    List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
     

    // Find the sum of each element of the given 2 lists
    List<Integer> c = IntStream.range(0, list1.size())
            .mapToObj(i -> list1.get(i) + list2.get(i))
            .collect(Collectors.toList());
    
    System.out.println("List 1: \n" + list1);
    System.out.println("List 2: \n" + list2);
    System.out.println("Sum of each element of lists: \n" + c);
	}
}
