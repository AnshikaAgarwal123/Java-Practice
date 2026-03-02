// Armstrong number is equal to sum of digits to the power number of digits
// 153= 1^3 + 5^3 + 3^3 =153
import java.util.*;
public class Armstrong_num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int count=0;
        int temp=num;
        while(temp!=0){
            temp/=10;
            count++;
        }
        temp=num;
        int sum=0;
        for(int i=1; i<=count; i++){
            int digit= temp%10;
            temp/=10;
            int pow= (int) Math.pow(digit, count);
            sum+=pow;
        }

        if(sum==num){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
