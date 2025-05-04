@FunctionalInterface
interface PrimeChecker {
    boolean isPrime(int number);
}
public class PrimeLambda {
    public static void main(String[] args) {
        PrimeChecker checker = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
        int[] numbers = {2, 3, 4, 5, 16, 17};
        for (int num : numbers) {
            System.out.println(num + " is prime? " + checker.isPrime(num));
        }
    }
}