package InterviewQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachStringInAnArray {
    public static void main(String[] args) {
        String[] arr = {"Java", "Spring", "Java", "Microservices", "Spring", "Java"};
        Map<String, Long> frequency = Arrays.stream(arr)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Frequency of each element:" + frequency);
    }
}
