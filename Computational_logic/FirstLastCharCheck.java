public class FirstLastCharCheck {
    public static void main(String[] args) {
        String text = "Java";

        if (text == null || text.length() == 0) {
            System.out.println("String is empty.");
            return;
        }

        char first = Character.toLowerCase(text.charAt(0));
        char last = Character.toLowerCase(text.charAt(text.length() - 1));

        boolean matches = (first == last);

        System.out.println("String: \"" + text + "\"");
        if (matches) {
            System.out.println("Result: The first and last characters are the same ('" + first + "').");
        } else {
            System.out.println("Result: The first ('" + first + "') and last ('" + last + "') characters are different.");
        }
    }
}