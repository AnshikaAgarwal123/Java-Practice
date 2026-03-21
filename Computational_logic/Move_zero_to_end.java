import java.util.*;
public class Move_zero_to_end {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n= sc.nextInt();
        int array[]= new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }

        //Sorting:- Moving only zeroes to the end
        for(int i=0; i<n-1; i++){   //<---n-1 coz we are taking one element extra.
            for(int j=0; j<n-1-i; j++){
                if(array[j]==0){
                    int temp= array[j];
                    array[j]= array[j+1];
                    array[j+1]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
