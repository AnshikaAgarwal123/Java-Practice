// Input-4
//    1
//   212
//  32123
// 4321234
import java.util.*;
public class Palindrome_Triangular {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        //Left half
        for(int i=1; i<=n; i++){
            for(int j=n; j>=1; j--){
                if(j==i || j<i){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int l=1; l<=i; l++){
                if(i==1 || l==1){

                }
                else{
                    System.out.print(l);
                }
            }
            System.out.println();
        }
    }
}
