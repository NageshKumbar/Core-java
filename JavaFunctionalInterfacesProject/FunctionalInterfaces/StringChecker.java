
@FunctionalInterface
interface StringChecker {
    boolean check(String str);
}

public class StringCheckerTest {
    public static void printMatching(String[] arr, StringChecker checker) {
        for (String s : arr) {
            if (checker.check(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        String[] data = {"apple", "banana", "ace", "ant", "cat"};
        printMatching(data, (s) -> s.startsWith("a"));
    }
}
