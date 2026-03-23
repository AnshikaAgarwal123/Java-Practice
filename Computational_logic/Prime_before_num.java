//Input- 10
//Prime number before this are 4
import java.util.*;
public class Prime_before_num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        boolean isprime= true;
        for(int i=2; i<n; i++){
            isprime=true;
            for(int j=2; j<=i/2; j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime== true){
                count++;
            }
        }
        System.out.println(count);
    }
}