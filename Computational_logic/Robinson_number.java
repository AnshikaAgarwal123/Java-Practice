//input- 145
//output- 1! + 4! + 5! = 145
import java.util.*;
public class Robinson_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int temp= n;
        int sum=0;
        while(temp!=0){
            int digit= temp%10;
            int product=1;
            for(int i=1; i<=digit; i++){
                product= product*i;
            }
            sum+= product;
            temp/=10;
        }
        if(sum==n){
            System.out.println("Robinson");
        }
        else{
            System.out.println("Not Robinson");
        }
    }
}
