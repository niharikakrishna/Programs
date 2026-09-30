import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStrings {
    public static void main(String[] args) 
    {
    	//Sort list based on the length of Strings
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
         
        List<String> sortedList = listOfStrings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(sortedList);
        
        System.out.println();
        // Find last element in Array
        List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        
        String lastElement = list.stream().skip(list.size() - 1).findFirst().get();
         
        System.out.println("Last Element: " + lastElement);
    }
}
