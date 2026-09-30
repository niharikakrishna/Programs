import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Dup {
	
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);
		// print the duplicate elements
		Set<Integer> dup = list.stream().filter(e -> Collections.frequency(list,e)>1).collect(Collectors.toSet());
		System.out.println(dup);
		
		//remove elements which have duplicate values
		Set<Integer> dupRemove = list.stream().filter(e -> Collections.frequency(list,e)==1).collect(Collectors.toSet());
		System.out.println(dupRemove);
		
		// remove duplicate elements
	    List<Integer> distinctNumbers = list.stream().distinct().collect(Collectors.toList());
	    System.out.println(distinctNumbers);
	    
	    //Duplicate in string
	    String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
	    List<String> lst = Arrays.asList(inputString.split(""));
	    
	    Set<String> st = lst.stream().filter(e -> Collections.frequency(lst, e)>1).collect(Collectors.toSet());
	    System.out.println(st);
	    
	    
	}
}