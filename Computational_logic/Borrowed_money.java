//k=cost multiplier
//n= the amount of money soldier have
//w= no. of bananas want to buy
//input- n=17, k=3, w=4
//Output- borrow=13
import java.util.*;
public class Borrowed_money{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int total=0;
        int n= sc.nextInt();
        int k= sc.nextInt();
        int w= sc.nextInt();
        for(int i=0; i<=w; i++){
            int banana= i*k;
            total+= banana;

        }
        if(n>=total){
            System.out.println("0");  
            //return 0; -----> Not used here coz inside void we can't return anything
        }          
        else{
            int borrow= total - n;
            System.out.println("Borrow="+ borrow);
        }
    }
}
