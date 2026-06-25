//Input-5
//Output-
// A
// AB
// ABC
// ABCD
// ABCDE
import java.util.*;
public class Alphabet_Increasing_Pyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                char ans= (char) (j+65);
                System.out.print(ans);
            }
            System.out.println();
        }
    }
}
