package Programs;

// PRIME NUMBER - A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. 
// For example 2, 3, 5, 7, 11,….. are prime numbers.
class PrimeNumber {
    static boolean isPrime(int n)
    {
        // 0 and 1 are not prime numbers. If no is below 1, it is not prime number
        if (n <= 1)
            return false;

        // check is done from 2 to n/2 as a number is not divisible by more than half its value. 
        // If it is divisible by any number from 2 to n/2, then it is not a prime number
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    // Driver Program
    public static void main(String args[])
    {
    	System.out.println(isPrime(11));
    	System.out.println(isPrime(15));
        System.out.println(isPrime(2));
    }
}
