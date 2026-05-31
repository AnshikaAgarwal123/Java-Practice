import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Lists_syntax {
    public static void main(String[] args) {
    List <String> names= new ArrayList<>();
    names.add("apple");
    names.add("banana");
    names.add("mango");
    String fruit = names.get(1);   // Gets "apple"
    String old = names.set(1, "mango"); // Replaces "apple" with "mango". 'old' holds "apple".
    names.remove(0);           // Removes whatever is at index 0
    names.remove("mango");     // Searches for "mango" and removes it if present
    System.out.println(names.size());
    System.out.println(names.contains("apple"));
    System.out.println(names.indexOf("banana")); // Returns -1 if banana isn't there

    // Getting a portion of a list (indexes 0 and 0) // 1 is not included in this
    List<String> sub = names.subList(0, 1); 

    // Converting a List back to a String Array
    String[] array = names.toArray(new String[0]); 

    // Sorting alphabetically
    names.sort(Comparator.naturalOrder());
    names.clear();             // List is now completely empty []
}
}