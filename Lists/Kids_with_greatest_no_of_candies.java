//Leetcode-1431. Kids With the Greatest Number of Candies
// Example 1:
// Input: candies = [2,3,5,1,3], extraCandies = 3
// Output: [true,true,true,false,true] 
// Explanation: If you give all extraCandies to:
// - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
// - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
// - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
// - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
// - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
import java.util.*;
public class Kids_with_greatest_no_of_candies {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int candies[]= new int[n];
        for(int i=0; i<n; i++){
            candies[i]= sc.nextInt();
        }
        int extraCandies= sc.nextInt();
        List <Boolean> result= new ArrayList<>();
        int max= Integer.MIN_VALUE;
        for(int i=0; i<candies.length; i++){
            if(candies[i]>max){
                max= candies[i];
            }
        }
        for(int i=0; i<candies.length; i++){
            if((candies[i]+extraCandies)>=max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        System.out.println(result);
    }
}

