package InterviewQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FourthSmallestDigit {

    public static void main(String[] args) {
        int[] arr = {45, 12, 89, 23, 5, 67, 34};

        int result = Arrays.stream(arr)
                .sorted()
                .skip(3)
                .findFirst()
                .orElseThrow();

        System.out.println("The fourth smallest digit is: " + result);
    }
}
