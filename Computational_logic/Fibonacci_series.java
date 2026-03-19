//n=10  It will print first 10 fibonacci numbers
//0 1 1 2 3 5 8 13 21 34
import java.util.*;
public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a1=0, a2=1;
        System.out.print(a1+" "+a2);
        for(int i=1; i<=n-2; i++){
            int a3=a1+a2;
            System.out.print(" "+a3+" ");
            a1=a2;
            a2=a3;
        }
    }
}
