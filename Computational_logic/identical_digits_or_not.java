//Input- 1111   Output- True
//Input- 2344   Output- False
import java.util.*;
public class identical_digits_or_not {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int count=0;
        int temp=num;
        while(num>0){
            num/=10;
            count++;
        }
        num= temp;
        int digit1=temp%10;
        temp/=10;
        boolean flag= true;
        for(int i=1; i<count; i++){
            int digit2= temp%10;
            temp/=10;
            if(digit1==digit2){
                flag=true;
            }
            else{
                flag= false;
                System.out.println("False");
                break;
            }
            digit2=digit1;
        }
        
        if (flag==true){
            System.out.println("True");
        }
    }
}
