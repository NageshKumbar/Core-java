
@FunctionalInterface
interface IntegerFilter {
    boolean filter(int num);
}

public class IntegerFilterTest {
    public static void filterArray(int[] arr, IntegerFilter filter) {
        for (int num : arr) {
            if (filter.filter(num)) {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        filterArray(nums, (n) -> n > 3);
    }
}
