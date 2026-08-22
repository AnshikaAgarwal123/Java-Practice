import java.util.*;

public class Suffix_Product {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int array[]= new int[n];
        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        int suffix[]= new int[n];
        suffix[n-1]= 1;
        for(int i=n-2; i>=0; i--){
            suffix[i]= suffix[i+1]*array[i+1];
        }
        System.out.println(Arrays.toString(suffix));
    }
}