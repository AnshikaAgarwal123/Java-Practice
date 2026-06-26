//Input-4
//Output-
//    A
//   ABA
//  ABCBA
// ABCDCBA
import java.util.*;
public class Alphabet_Pyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                char ans= (char)(65+j);
                System.out.print(ans);
            }
            if(i!=1){
                for(int j=0; j<i-1; j++){
                    char ans= (char)(65+i-j-2);
                    System.out.print(ans);
                }
            }
            System.out.println();
        }
    }
}
