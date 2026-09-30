import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) 
    {
        String str = "Java Concept Of The Day";
         // Split the string into independent words -> reverse each string using StringBuffer reverse() -> join the reversed word
        String reversedStr = Arrays.stream(str.split(" "))
                                    .map(word -> new StringBuffer(word).reverse())
                                    .collect(Collectors.joining(" "));
         
        System.out.println(reversedStr);
        int[] arr = {1,2,3};
        for(int i : arr)
        	System.out.println(i);
    }
} 
