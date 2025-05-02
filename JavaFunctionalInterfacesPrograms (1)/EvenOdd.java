@FunctionalInterface
interface EvenOddChecker {
    boolean isEven(int n);
}
public class EvenOdd {
    public static void main(String[] args) {
        EvenOddChecker lambdaChecker = n -> n % 2 == 0;
        EvenOddChecker anonChecker = new EvenOddChecker() {
            public boolean isEven(int n) {
                return n % 2 == 0;
            }
        };
        int[] numbers = {1, 2, 3, 4};
        for (int num : numbers) {
            System.out.println(num + " is even? Lambda: " + lambdaChecker.isEven(num) +
                               ", Anonymous: " + anonChecker.isEven(num));
        }
    }
}