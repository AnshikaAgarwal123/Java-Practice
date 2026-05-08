// Input-4
// ****
//  ****
//   ****
//    ****
import java.util.*;
public class Rhombus_pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int spaces=0;
        for(int i=1;i<=n; i++){
            for(int j=1; j<=n; j++){
                while(spaces>0){
                    System.out.print(" ");
                    spaces--;
                }
                System.out.print("*");
            }
            spaces+=i;
            System.out.println();
        }
    }
}
