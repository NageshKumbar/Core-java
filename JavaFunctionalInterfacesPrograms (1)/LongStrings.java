public class LongStrings {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "kiwi", "watermelon"};
        int length = 5;
        java.util.Arrays.stream(arr)
            .filter(s -> s.length() > length)
            .forEach(System.out::println);
    }
}