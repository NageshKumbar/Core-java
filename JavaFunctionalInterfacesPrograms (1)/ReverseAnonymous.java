@FunctionalInterface
interface StringReverser {
    String reverse(String str);
}
public class ReverseAnonymous {
    public static void main(String[] args) {
        StringReverser reverser = new StringReverser() {
            public String reverse(String str) {
                return new StringBuilder(str).reverse().toString();
            }
        };
        System.out.println("Reversed: " + reverser.reverse("hello"));
    }
}