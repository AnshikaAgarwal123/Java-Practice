//Leetcode- 205. Isomorphic Strings
//Example 1:
// Input: s = "egg", t = "add"
// Output: true
import java.util.*;

public class Isomorphic_String {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String t= sc.nextLine();
        HashMap <Character,Character> words= new HashMap<>();

        if(s.length()!=t.length()){
        System.out.println("False");
        return;
        } 

        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(!words.containsKey(ch)){
                words.put(ch, t.charAt(i));
            }
            else{
                if(words.get(ch)!=t.charAt(i)){
                    System.out.println("False");
                    return;
                }

            }
        } 
        HashSet<Character> values= new HashSet<>(words.values());
        if(words.size()!=values.size()){
            System.out.println("False");
            return;
        }
        System.out.println("True");
    }
}
