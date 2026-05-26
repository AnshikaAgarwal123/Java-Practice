//Leetcode- 349. Intersection of Two Arrays
import java.util.*;

public class Intersection_of_two_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array 1");
        int m = sc.nextInt();
        int nums1[] = new int[m];
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter array 2");
        int n = sc.nextInt();
        int nums2[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }
        HashSet<Integer> intersection = new HashSet<>();
        // Here we will solve this using hashset
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            int num = nums2[i];
            if (set.contains(num)) {
                intersection.add(num);
            }
        }
        System.out.println(Arrays.toString(intersection.stream().mapToInt(Integer::intValue).toArray()));
        // This syntax is
        // used to convert a hashmap into an array to match the kind od output on
        // leetcode.
    }
}
//In this question if u cant remember the final syntax of converting a hashset to array then create 
// an array and store all the values of hashmap to it and finally return it.