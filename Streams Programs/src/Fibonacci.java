import java.util.stream.Stream;

//The Fibonacci sequence is a sequence where the next term is the sum of the previous two terms.
//The first two terms of the Fibonacci sequence are 0 followed by 1. 
//The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21

public class Fibonacci {
    public static void main(String[] args) 
    {
        Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]})
                .limit(10)
                .map(f -> f[0])
                .forEach(i -> System.out.print(i+" "));
    }
}
