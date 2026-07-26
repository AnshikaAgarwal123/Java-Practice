public class WordCounter {
    public static void main(String[] args) {
        String sentence = "Learning Java step by step";

        if (sentence == null || sentence.trim().isEmpty()) {
            System.out.println("Word count: 0");
            return;
        }

        String[] words = sentence.trim().split("\\s+");

        System.out.println("Sentence: \"" + sentence + "\"");
        System.out.println("Total Words: " + words.length);
    }
}