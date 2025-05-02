@FunctionalInterface
interface IntCondition {
    boolean test(int n);
}
public class IntFilter {
    public static void filter(int[] arr, IntCondition condition) {
        for (int n : arr) {
            if (condition.test(n)) {
                System.out.println(n);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        filter(arr, n -> n > 3);
    }
}