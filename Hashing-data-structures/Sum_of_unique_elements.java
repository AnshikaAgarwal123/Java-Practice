import java.util.*;
public class Sum_of_unique_elements {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        HashSet <Integer> numbers= new HashSet<>();
        int array[]= new int[nums.length];
        int x=0;
        for(int i=0; i<nums.length; i++){
            if(numbers.contains(nums[i])){
                array[x]= nums[i];
                x++;
            }
            //we will store all the values which are repeating and then finally remove all of them.
            else{
                numbers.add(nums[i]);
            }
        }
        int sum=0;
        for(int y: array){
            numbers.remove(y);
        }
        for(int z: numbers){
            sum+=z;
        }
        System.out.println(sum);
    }
}
