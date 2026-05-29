//Leetcode-350. Intersection of Two Arrays II
//Example:
// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]
import java.util.*;
public class Intersection_of_two_arrays2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        int nums1[]= new int[m];
        for(int i=0; i<m; i++){
            nums1[i]= sc.nextInt();
        }
        int n= sc.nextInt();
        int nums2[]= new int[n];
        for(int i=0; i<n; i++){
            nums2[i]= sc.nextInt();
        }
        HashMap <Integer, Integer> numbers= new HashMap<>();
        int array[]= new int[nums1.length+nums2.length];
        for(int i=0; i<nums1.length; i++){
            if(numbers.containsKey(nums1[i])){
                numbers.put(nums1[i], numbers.get(nums1[i])+1);
            }
            else{
                numbers.put(nums1[i], 1);
            }
        }

        int x=0;
        for(int i=0; i<nums2.length; i++){
            if(numbers.containsKey(nums2[i]) && numbers.get(nums2[i])>0){
                numbers.put(nums2[i], numbers.get(nums2[i])-1);
                array[x]= nums2[i];
                x++;
            }
        }
       
    System.out.println(Arrays.toString(Arrays.copyOf(array, x)));
    }
}