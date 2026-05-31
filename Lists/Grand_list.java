import java.util.ArrayList;
import java.util.List;

public class Grand_list {
    public static void main(String[] args) {
        
    
    // 1. Create the outer "cabinet"
List<List<String>> grandList = new ArrayList<>();

// 2. Create your first inner "folder" and add some items
List<String> folder1 = new ArrayList<>();
folder1.add("bat");
folder1.add("tab"); // Anagrams!

// 3. Create a second inner "folder"
List<String> folder2 = new ArrayList<>();
folder2.add("eat");
folder2.add("tea");
folder2.add("ate"); // More anagrams!

// 4. Put the folders into the cabinet
grandList.add(folder1);
grandList.add(folder2);

// grandList now looks like: [ ["bat", "tab"], ["eat", "tea", "ate"] ]

grandList.add(new ArrayList<>());   //Shortcut to create a grand list.
// grandList is now: [ [] ]

grandList.get(0).get(1); // Syntax to access the elements of grand list

grandList.get(0).add("ate"); //to append at the end

grandList.get(0).size(); // size of a particular list

// Loop through a grand list
for (List<String> innerList : grandList) {
    for (String word : innerList) {
        System.out.println(word);
    }
}

grandList.clear(); // Empties the outer list entirely: []

}
}