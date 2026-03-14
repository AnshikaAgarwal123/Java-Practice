//Duck no. is a no which contains atleast one zero but does not start with zero
//Here we are checking for a 3 digit number
import java.util.*;
public class Duck_no {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();    //if we input 089 or something else starting with zero, java 
        if(n>99 && n<1000){     //compiler with treat it as 89 but it will count as 3 digit.
        
        }                       //<----- Check b/w 100 and 999 for 3 digit number.
        else{
            System.out.println("It is not a 3 digit number");
            return;
        }
        for(int i=1; i<=2; i++){
            int digit= n%10;
            if(digit==0){
                System.out.println("It is a duck number");
                return;
            }
            n/=10;
        }
    }
}
