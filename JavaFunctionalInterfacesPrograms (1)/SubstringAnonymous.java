@FunctionalInterface
interface SubstringFilter {
    boolean contains(String str);
}
public class SubstringAnonymous {
    public static void main(String[] args) {
        SubstringFilter filter = new SubstringFilter() {
            public boolean contains(String str) {
                return str.contains("test");
            }
        };
        String[] arr = {"test123", "example", "mytest", "hello"};
        for (String s : arr) {
            if (filter.contains(s)) {
                System.out.println(s);
            }
        }
    }
}