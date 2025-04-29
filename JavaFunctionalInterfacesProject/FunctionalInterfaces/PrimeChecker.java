
@FunctionalInterface
interface PrimeChecker {
    boolean isPrime(int number);
}

public class PrimeCheckerTest {
    public static void main(String[] args) {
        PrimeChecker checker = (num) -> {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        };
        int[] numbers = {2, 3, 4, 5, 10, 13, 17};
        for (int num : numbers) {
            System.out.println(num + " is prime? " + checker.isPrime(num));
        }
    }
}
