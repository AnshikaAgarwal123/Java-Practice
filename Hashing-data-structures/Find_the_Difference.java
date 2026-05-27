//Leetcode- 389. Find the Difference
//Example :
// Input: s = "abcd", t = "abcde"
// Output: "e"
// Explanation: 'e' is the letter that was added.
import java.util.*;
public class Find_the_Difference {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String t= sc.nextLine();
        HashMap <Character, Integer> words= new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            words.put(c, words.getOrDefault(c, 0)+1);
        }
        //we will store the character as well as its frequency

        for(int i=0; i<t.length(); i++){
            char c= t.charAt(i);
            if(!words.containsKey(c) || words.get(c)==0 ){
                System.out.println(c);
                return;
            }
            words.put(c, words.get(c)-1);
        }
        // we will compare and reduce the freq by one in every iteration.
    }
}