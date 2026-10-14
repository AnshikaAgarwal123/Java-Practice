//Its time complexity is O(n^2) but in the best case its time complexity is O(n)
import java.util.*;
public class Insertion_sort{
    public static void main(String[] args) {
        int arr[]= { 6, 4, 7, 9, 2, 4};
        for(int i=0; i<arr.length; i++){
            int j=i;
            while(j>0 && arr[j-1]> arr[j]){
                int temp= arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
