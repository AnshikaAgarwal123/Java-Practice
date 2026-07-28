public class RemoveSpaces {
    public static void main(String[] args) {
        String text = "J a v a   P r o g r a m m i n g";

        String noSpaces = text.replaceAll("\\s+", "");

        System.out.println("Original:  \"" + text + "\"");
        System.out.println("No Spaces: \"" + noSpaces + "\"");
    }
}