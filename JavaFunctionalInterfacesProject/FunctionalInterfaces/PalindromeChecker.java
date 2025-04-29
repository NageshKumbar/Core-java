
@FunctionalInterface
interface PalindromeChecker {
    boolean isPalindrome(String str);
}

public class PalindromeCheckerTest {
    public static void main(String[] args) {
        PalindromeChecker checker = (str) -> {
            String clean = str.replaceAll("\\s+", "").toLowerCase();
            return clean.equals(new StringBuilder(clean).reverse().toString());
        };
        String[] words = {"madam", "racecar", "hello", "level"};
        for (String word : words) {
            System.out.println(word + " is palindrome? " + checker.isPalindrome(word));
        }
    }
}
