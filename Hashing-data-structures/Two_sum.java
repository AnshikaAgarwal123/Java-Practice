// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
import java.util.*; //HashMap is included in this otherwise we need to import that.
public class Two_sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the target");
        int target = sc.nextInt();
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        HashMap<Integer, Integer> pairs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentnum = nums[i];
            int complement = target - currentnum;
            if (pairs.containsKey(complement)) {
                System.out.print("["+ pairs.get(complement));
                System.out.print(", "+i+"]");
            }
            pairs.put(currentnum, i);
        }
        return;
    }
}
