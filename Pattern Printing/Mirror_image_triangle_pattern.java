// Input-7
// 1 2 3 4 
//  2 3 4
//   3 4
//    4
//   3 4
//  2 3 4
// 1 2 3 4
import java.util.*;
public class Mirror_image_triangle_pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int mid=n/2+1;
        for(int i=1; i<=mid; i++){
            for(int j=1; j<=mid; j++){
                if(j>=i){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=mid; i>=1; i--){
            for(int j=1; j<=mid; j++){
                if(i==mid){

                }
                else if(j>=i){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            if(i!=mid){
                System.out.println();
            }
            
        }
    }
}
