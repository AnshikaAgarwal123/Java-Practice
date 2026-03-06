//Every element appears twice except one 
//Input:- [4,1,2,1,2]
//Output:- 4
import java.util.*;
public class Check_count {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int array[]= new int[n];
        int count[]= new int[100];

        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }

        for(int i=0; i<n; i++){
            count[array[i]]++; 
        }

        for(int i=0; i<100; i++){
            if(count[i]%2!=0){
                System.out.println(i);
                break;
            }
        }
    }
}
//It can also be done using XOR.