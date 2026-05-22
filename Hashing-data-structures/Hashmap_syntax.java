////This file basically contains all the information related to a hashmap. The syntax of it,
// the functions it contains and how to iterate through every element in that.
// Whenever i need to learn from basic about hashmap i can refer this.
import java.util.HashMap;
import java.util.Map;

public class Hashmap_syntax {
    public static void main(String[] args) {
        HashMap<String, Integer> studentsmarks = new HashMap<>();
        HashMap<String, Integer> map = new HashMap<>(); // Syntax shortcut
        studentsmarks.put("Anshika", 100);
        studentsmarks.put("Riya", 90);
        studentsmarks.put("Priya", 85);
        studentsmarks.put("Anshika", 95); // it will overwrite the previous one

        System.out.println(studentsmarks.get("Anshika")); // return the value associated with that key
        System.out.println(studentsmarks.containsKey("Riya")); // check if that particular key exists there
        studentsmarks.remove("Priya"); // to remove an entry
        System.out.println(studentsmarks.get("Priya")); // returns null

        //if that particular key exists then return its value otherwise return 9
        System.out.println(studentsmarks.getOrDefault("Anshikaa", 9));  
        
        //to iterate through the hash map
        for (Map.Entry<String, Integer> row : studentsmarks.entrySet()) {
            String name= row.getKey();
            int marks= row.getValue();
            System.out.println("name: "+ name+ " scored "+ marks);
        }
    }
}
