
@FunctionalInterface
interface StringConverter {
    String convert(String str);
}

public class StringConverterTest {
    public static void convertArray(String[] arr, StringConverter converter) {
        for (String s : arr) {
            System.out.println(converter.convert(s));
        }
    }

    public static void main(String[] args) {
        String[] arr = {"hello", "world"};
        convertArray(arr, String::toUpperCase);
    }
}
