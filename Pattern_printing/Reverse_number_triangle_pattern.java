// Input-4
// 1 2 3 4 
//  2 3 4
//   3 4
//    4
import java.util.*;
public class Reverse_number_triangle_pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=i){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
