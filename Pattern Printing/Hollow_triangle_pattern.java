// Input-5
//      *
//     * *
//    *   *
//   *     *
//  *       *
// ***********
import java.util.Scanner;

public class Hollow_triangle_pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<=n; i++){
            if(i==n){
                for(int x=1; x<=2*n+1; x++){
                    System.out.print("*");
                }
            }
            else{
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            
                System.out.print("*");

            for(int l=1; l<=2*i-1; l++){
                System.out.print(" ");
            }
            if(i!=0){
                System.out.print("*");
            }
        }
            System.out.println();
        }
    }
}
