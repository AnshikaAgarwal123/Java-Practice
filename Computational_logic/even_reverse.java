//input- 123456
//output- 642
import java.util.*;

public class even_reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int temp=num, sum=0;
        while(temp>0){
            int digit= temp%10;;
            temp/=10;
            if(digit%2==0){
                sum= sum*10+ digit;
            }

        }
        System.out.println(sum);
    }
}
