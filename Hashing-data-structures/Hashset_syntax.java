//This file basically contains all the information related to a hashset. The syntax of it,
// the functions it contains and how to iterate through every element in that.
//Whenever i need to learn from basic about hashset i can refer this.
import java.util.HashSet;

public class Hashset_syntax {
    public static void main(String[] args) {
        HashSet<String> values = new HashSet<>();
        values.add("C");
        values.add("Java");
        values.add("Python");
        System.out.println(values.contains("C"));
        System.out.println(values.size());

        // It will remove that particular value
        values.remove("C");
        System.out.println(values.contains("C"));

        for (String languages : values) {
            System.out.println(languages);
        }
        //to iterate through every element in the hash set

        values.clear(); // It will remove everything inside the hashset
    }
}
