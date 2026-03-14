//Input- n=4
//*      *
//**    **
//***  ***
//********
//********
//***  ***
//**    **
//*      *
import java.util.*;
public class Full_Butterfly{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            //left side upper pattern
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //Spaces in upper half
            for(int k=1; k<=2*(n-i); k++){       //2(n-i) Concept
                System.out.print(" ");
            }

            //Upper right pattern
            for(int l=1; l<=i; l++){
                System.out.print("*");
            }

            System.out.println();
        }
        //For lower half
        for(int i=n; i>=1; i--){
            //lower left pattern
            for(int j=i; j>0; j--){
                System.out.print("*");
            }
            //spaces
            for(int k=2*(n-i); k>0; k--){   //2(n-i) concept
                System.out.print(" ");
            }
            //lower right pattern
            for(int l=i; l>0; l--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}