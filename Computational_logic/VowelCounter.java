public class VowelCounter {
    public static void main(String[] args) {
        String text = "Hello World";
        int vowelCount = 0;

        String lowerText = text.toLowerCase();

        for (int i = 0; i < lowerText.length(); i++) {
            char ch = lowerText.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Original String: \"" + text + "\"");
        System.out.println("Total Vowels: " + vowelCount);
    }
}