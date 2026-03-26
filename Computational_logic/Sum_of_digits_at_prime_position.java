import java.util.*;
public class Sum_of_digits_at_prime_position {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int temp=num, count=0;
        while(temp>0){
            temp/=10;
            count++;
        }
        temp=num;
        int position=2, sum=0;
        boolean isprime=true;
        for(int i=2; i<=count; i++){
            isprime=true;
            
            for(int j=2; j<=count/2; j++){
                if(i%j==0){
                    isprime=false;
                }
            }
            if(isprime== true){
                position=i;
            }
            if(position!=0){
                int digit= temp% (int)(Math.pow(10, count-position));
                digit%=10;
                System.out.println(digit);
                sum+=digit;
                temp/=10;
            }
            position=0;
        }
        System.out.println(sum);
    }
}
not completed yet