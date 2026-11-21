package InterviewQuestions;

import java.util.Arrays;

public class SumDigitsInString {
    public static void main(String[] args) {
        String input = "I have 12 apples and 3 mangoes.";
        int sum = sumDigitsInString(input);
        System.out.println("Sum of digits in the string: " + sum);
    }

//    public static int sumDigitsInString(String str) {
//        return str.chars()
//                .filter(Character::isDigit)
//                .map(Character::getNumericValue)
//                .sum();
//    }


    // Explanation:
    // 1. The method sumDigitsInString takes a string as input.
    // 2. It splits the string into an array of substrings using a regular expression
    //    that matches any non-digit character (\\D+). After split: ["", "12", "3", ""]
    // 3. It filters out any empty substrings that may result from the split operation using the filter method.
    // After filter: ["12", "3"]
    // 4. It converts the remaining substrings to integers using mapToInt and Integer::parseInt.
    //    Converts "12" to 12 and "3" to 3.
    // 5. Finally, it sums up all the integers using the sum method and returns the result.
    public static int sumDigitsInString(String str) {
        return Arrays.stream(str.split("\\D+"))
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
    }


}
