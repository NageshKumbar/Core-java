
public class StringLengthFilterTest {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cat", "dog", "elephant"};
        int length = 3;
        for (String s : arr) {
            if (s.length() > length) {
                System.out.println(s);
            }
        }
    }
}
