//Input-5
//Output-
// E
// ED
// EDC
// EDCB
// EDCBA
import java.util.*;
public class Alphabet_Decreasing_Pyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                char ans= (char)(65+n-j-1);
                System.out.print(ans);
            }
            System.out.println();
        }
    }
}
