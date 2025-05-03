@FunctionalInterface
interface PalindromeChecker {
    boolean isPalindrome(String str);
}
public class PalindromeLambda {
    public static void main(String[] args) {
        PalindromeChecker checker = s -> s.equals(new StringBuilder(s).reverse().toString());
        String[] words = {"madam", "hello", "racecar", "java"};
        for (String word : words) {
            System.out.println(word + " is palindrome? " + checker.isPalindrome(word));
        }
    }
}