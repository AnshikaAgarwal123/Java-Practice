//Leetcode-290. Word Pattern
// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true
import java.util.*;
public class Word_pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String pattern= sc.nextLine();
        String s= sc.nextLine();
        HashMap <Character, String> words= new HashMap<>();
        String[] array= s.split(" ");
        if(array.length!=pattern.length()){
            System.out.println("False");
            return;
        }
        for(int i=0; i<pattern.length(); i++){
            char ch= pattern.charAt(i); 
            if(!words.containsKey(ch)){
            words.put(ch, array[i]);
            }
            else{
                String x= words.get(ch);
                if(x.equals(array[i])){

                }
                else{
                    System.out.println("False");
                    return;
                }
            }
        }
        HashSet <String> values= new HashSet<>(words.values());
        if(values.size()!=words.size()){
            System.out.println("False");
            return;
        }
        System.out.println("True");
    }
}
