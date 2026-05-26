//Leetcode-1207. Unique Number of Occurrences
//Input: arr = [1,2,2,1,1,3]
// Output: true
// Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
import java.util.*;
public class Unique_number_of_occurences {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        HashMap <Integer, Integer> nums= new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int num= arr[i];
            nums.put(arr[i], nums.getOrDefault(num,0)+1);
        }
        //we will store the num as well as its freq in the hashmap

        HashSet <Integer> values= new HashSet<>(nums.values());
        // syntax for adding hashmap's values into a hashset.

        if(nums.size()==values.size()){
            System.out.println("True");
            return;
        }
        System.out.println("False");
    }
}
