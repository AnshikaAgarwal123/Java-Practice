//Input-4
//0
//1 1
//2 3 5
//8 13 21 34
import java.util.*;
public class Fibonaaci_pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a1=0, a2=1, a3=1;
        System.out.println(a1);
        System.out.println(a2+" "+a3);
        a1=a2;
        a2=a3;
        for(int i=1; i<=n-2; i++){
            for(int j=i+2; j>0; j--){
                    a3=a1+a2;
                    System.out.print(a3+" ");
                    a1=a2;
                    a2=a3;
            }
            System.out.println();
        }
    }
}