//Input-4
//Output-
//    1
//   222
//  33333
// 4444444
import java.util.*;
public class Numbered_Pattern2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<(2*i)-1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
