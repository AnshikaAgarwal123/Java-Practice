import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int product= a*b;
        //First we will find the GCD of that
        while(b!=0){
            int temp=b;
            b= a%b;
            a= temp;
        }
        //Now the value of gcd is stored in a
        int lcm= product/a;

        System.out.println("The LCM of these numbers is: "+ lcm);
    }
}
