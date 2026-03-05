//Input-8
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
import java.util.*;
public class Diamond_pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int mid=n/2;
        int spaces=n-1, star=1;
        for(int i=1; i<=mid; i++){
            spaces=mid-i;
            star= 2*i-1;
            for(int j=1; j<=2*n-1; j++){
                if(spaces>0){
                    System.out.print(" ");
                    spaces--;
                }
                else if(star>0){
                    System.out.print("*");
                    star--;
                }
            }
            System.out.println();
            
        }
        //lower half
        spaces=0;
    for(int i=1; i<mid; i++){
        spaces=i;
        star= 2*(mid-i)-1;
        for(int j=1; j<=2*n-1; j++){
            if(spaces>0){
                System.out.print(" ");
                spaces--;
            }
            else if(star>0){
                System.out.print("*");
                star--;
            }
        }
        star= star-2;
        System.out.println();
    }
    
    }
    
}
