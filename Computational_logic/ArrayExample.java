public class ArrayExample {
    public static void main(String[] args) {
        String[] languages = {"Java", "Python", "C++", "JavaScript", "HTML/CSS"};

        System.out.println("Languages I'm learning:");
        System.out.println("-----------------------");

        // The standard for-loop
        // i starts at 0; it runs as long as i is less than the array length
        for (int i = 0; i < languages.length; i++) {
            System.out.println("Index " + i + ": " + languages[i]);
        }
    }
}