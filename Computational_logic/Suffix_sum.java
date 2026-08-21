//Input- [1,2,3,4,5]
//Output- [15, 14, 12, 9, 5]
import java.util.*;
public class Suffix_sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int array[]= new int[n];
        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        int rightsum[]= new int[n];
        rightsum[n-1]= array[n-1];
        for(int i=n-2; i>=0; i--){
            rightsum[i]= rightsum[i+1]+ array[i];
        }
        System.out.println(Arrays.toString(rightsum));
    }
}