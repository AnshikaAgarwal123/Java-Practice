//Input- 123456
//Output- 163452
import java.util.*;
public class Reverse_only_even_digits {
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
        }              //<---- we got sum as 642 

        temp=num;
        int finalsum=0;
        while(temp>0){
            int digit= temp%10;
            temp/=10;
            if(digit%2==0){
                digit= sum%10;
                sum/=10;
                finalsum=finalsum*10+ digit;
            }
            else{
                finalsum=finalsum*10+ digit;
            }
        }               //<---- if even digit digit then reversed but wee got the finalnum in 
                        // reverse form.
        while(finalsum>0){
            int digit=finalsum%10;
            finalsum/=10;
            System.out.print(digit);
        }               // reversed to get the output

    }
}
