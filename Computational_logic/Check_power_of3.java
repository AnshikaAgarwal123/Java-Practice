import java.util.*;
public class Check_power_of3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num= sc.nextInt();
    int finalnum=0;
    while(num%3==0){
        num/=3;
    }
    if(num==1){
        System.out.println("Power of 3");
    }
    else{
        System.out.println("Not a power of 3");
    }
}
}
