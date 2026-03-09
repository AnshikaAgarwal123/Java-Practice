// input-4
// 1 
// 0 1
// 0 1 0
// 1 0 1 0
import java.util.*;
public class Zero_one_triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(a+ " ");
                if(a==0)
                    a=1;
                else
                    a=0;
            }
            System.out.println();
        }
    }
}
