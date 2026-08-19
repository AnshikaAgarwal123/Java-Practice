//This algorithm is used to rotate the array k times
//Input- [1,2,3,4,5] k=3
//Output- [3,4,5,1,2]
import java.util.*;
public class Reversal_algorithm{
    public static void Reverse(int[] arr, int left, int right){
        while(left<right){
            int temp= arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int array[]= new int[n];
        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Rotation times:");
        int k=sc.nextInt();
        Reverse(array, 0, n-1);
        Reverse(array, 0, k-1);
        Reverse(array, k, n-1);
        System.out.println(Arrays.toString(array));
    }
}
