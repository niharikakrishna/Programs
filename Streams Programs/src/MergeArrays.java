import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArrays {
    public static void main(String[] args) 
	    {
	        int[] a = new int[] {4, 2, 7, 1};
	         
	        int[] b = new int[] {8, 3, 9, 5};
	         
	        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
	         
	        System.out.println(Arrays.toString(c));
	        
	        // merge without duplicates
	        
	        int[] x = new int[] {4, 2, 5, 1};
	         
	        int[] y = new int[] {8, 1, 9, 5};
	         
	        int[] z = IntStream.concat(Arrays.stream(x), Arrays.stream(y)).sorted().distinct().toArray();
	         
	        System.out.println(Arrays.toString(z));
	    }
}
