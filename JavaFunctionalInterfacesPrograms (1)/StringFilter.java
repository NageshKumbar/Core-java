@FunctionalInterface
interface StringChecker {
    boolean check(String str);
}
public class StringFilter {
    public static void filterAndPrint(String[] arr, StringChecker checker) {
        for (String s : arr) {
            if (checker.check(s)) {
                System.out.println(s);
            }
        }
    }
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "avocado", "grape"};
        filterAndPrint(arr, s -> s.startsWith("a"));
    }
}