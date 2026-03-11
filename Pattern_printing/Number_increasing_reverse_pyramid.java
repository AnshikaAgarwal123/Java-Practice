// Input-4
// 1234
// 123
// 12
// 1
import java.util.*;
public class Number_increasing_reverse_pyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
