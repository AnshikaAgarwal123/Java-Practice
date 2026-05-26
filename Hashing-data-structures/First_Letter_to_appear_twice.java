//Leetcode- 2351. First Letter to Appear Twice
import java.util.*;
public class First_Letter_to_appear_twice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        HashSet <Character> alpha= new HashSet<>();
       for(int i=0; i<s.length(); i++){
        if(alpha.contains(s.charAt(i))){
            System.out.println(s.charAt(i));
            return;
        }
        else{
            alpha.add(s.charAt(i));
        }
       } 
    }
}
