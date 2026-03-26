//input- n=1234, k=2    (1234)^2= 1522756
//output-false
//input- n=625, k=3 (625)^2= 390625
//output- True
import java.util.*;
public class Strong_suffix_no {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the no. for square");
    int n= sc.nextInt();
    System.out.println("Enter the number of digits through which we have to check");
    int k= sc.nextInt();
    int x= (int) Math.pow(10,k);
    int num1= n%x;
    int sqnum= n*n;
    int num2=sqnum%x;   //It will extract last those digits
    if(num1==num2){
        System.out.println("True");
    }
    else{
        System.out.println("False");
    }   
}
}
