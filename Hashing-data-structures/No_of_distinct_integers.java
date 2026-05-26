//Leetcode- 2442. Count Number of Distinct Integers After Reverse Operations
//Input: nums = [1,13,10,12,31]
// Output: 6
// Explanation: After including the reverse of each number, the resulting array is [1,13,10,12,31,1,31,1,21,13].
// The reversed integers that were added to the end of the array are underlined. Note that for the integer 10, after reversing it, it becomes 01 which is just 1.
// The number of distinct integers in this array is 6 (The numbers 1, 10, 12, 13, 21, and 31).
import java.util.*;
public class No_of_distinct_integers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int array[]= new int[(nums.length)*2];
        for(int i=0; i<nums.length; i++){
            array[i]= nums[i];
        }
        int x=nums.length;
        for(int i=0; i<nums.length; i++){
            int sum=0;
            while(nums[i]!=0){
            int last_word= nums[i]%10;
            sum= sum*10 + last_word;
            nums[i]/=10;
            }
            array[x]= sum;
            x++;
        }

        HashSet <Integer> num= new HashSet<>();
        for(int i=0; i<array.length; i++){
            num.add(array[i]);
        }
        System.out.println(num.size());
    }
}
