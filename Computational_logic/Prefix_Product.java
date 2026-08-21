import java.util.*;
public class Prefix_Product {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int array[]= new int[n];
        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        int prefix[]= new int[n];
        prefix[0]= 1;
        for(int i=1; i<n; i++){
            prefix[i]= prefix[i-1]*array[i-1];
        }
        System.out.println(Arrays.toString(prefix));
    }
}