import java.util.function.Function;
public class StringConverter {
    public static void convert(String[] arr, Function<String, String> converter) {
        for (String s : arr) {
            System.out.println(converter.apply(s));
        }
    }
    public static void main(String[] args) {
        String[] arr = {"hello", "world"};
        convert(arr, String::toUpperCase);
        convert(arr, String::toLowerCase);
    }
}