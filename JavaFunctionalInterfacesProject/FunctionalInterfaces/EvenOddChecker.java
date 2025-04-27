
@FunctionalInterface
interface EvenOddChecker {
    boolean isEven(int num);
}

public class EvenOddCheckerTest {
    public static void main(String[] args) {
        EvenOddChecker lambdaChecker = (num) -> num % 2 == 0;
        System.out.println("Lambda: 4 is even? " + lambdaChecker.isEven(4));

        EvenOddChecker anonymousChecker = new EvenOddChecker() {
            public boolean isEven(int num) {
                return num % 2 == 0;
            }
        };
        System.out.println("Anonymous: 5 is even? " + anonymousChecker.isEven(5));
    }
}
