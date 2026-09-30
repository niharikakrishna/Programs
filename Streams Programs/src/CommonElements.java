import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonElements {
	public static void main(String[] args) 
    {
	    List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
	    
	    List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
	     
	    list1.stream().filter(list2::contains).forEach(System.out::println);

	    // Find the sum of each element of the given 2 lists
//	    Create an integer stream of size of list1
//	    -> map each element of stream to be sum of elements at respective index
//	    -> convert to Integer object
//	    -> collect as a list & print
	    List<Integer> c = IntStream.range(0, list1.size())
                .map(i -> list1.get(i) + list2.get(i))
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toList());
	    
	    System.out.println(c);
	}
}
