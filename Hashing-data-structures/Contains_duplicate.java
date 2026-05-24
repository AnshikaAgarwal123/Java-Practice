//Leetcode problem-217 (Contains Duplicate)
//This question can also be solved by sorting and comparing but here we have used hasset.
import java.util.HashSet;
import java.util.*;
public class Contains_duplicate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        HashSet<Integer> seen= new HashSet<>();
        for(int i=0; i<nums.length; i++){
            seen.add(nums[i]);
        }
        if(seen.size()<nums.length){
            System.out.println("True");
            return;
        }
        else{
            System.out.println("False");
        }
    }
}