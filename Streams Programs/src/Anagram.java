
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
// Example: The word "secure" is an anagram of "rescue."

public class Anagram {
    @SuppressWarnings("resource")
	public static void main(String[] args) 
    {
//        String s1 = "RaceCar";
//        String s2 = "CarRace";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();
        
        System.out.println("\n");
        // split into stream -> convert to Uppercase -> sort -> rejoin -> compare the two strings
        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
         
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
         
        if (s1.equals(s2)) 
        {
            System.out.println("Two strings are anagrams");
        }
        else
        {
            System.out.println("Two strings are not anagrams");
        }
    }
}
