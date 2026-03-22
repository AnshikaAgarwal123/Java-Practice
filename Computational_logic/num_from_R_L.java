//input- 123
//output- 1 2 3
import java.util.*;
public class num_from_R_L {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int temp=num, count=0;
        while(temp>0){
            temp/=10;
            count++;
        }
        temp=num;
        for(int i=count-1; i>=0; i--){
            int digit= temp/(int)Math.pow(10, i);
            digit%=10;
            System.out.println(digit);
        }
    }
}
