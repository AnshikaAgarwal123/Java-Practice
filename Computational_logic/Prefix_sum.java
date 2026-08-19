//Input- [1,2,3,4,5]
//Output- [1,3,6,10,15]
import java.util.*;
public class Prefix_sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int array[]= new int[n];
        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        int leftsum[]= new int[n];
        leftsum[0]= array[0];
        for(int i=1; i<n; i++){
            leftsum[i]= leftsum[i-1]+array[i];
        }
        System.out.println(Arrays.toString(leftsum));
    }
}   