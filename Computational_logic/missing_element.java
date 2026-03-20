//input- [3,0,1]
//output- 2
import java.util.*;
public class missing_element{
    public static void main(String[] args) {
    int array[]= {3,0,1};
    //Sorting of array
    for(int i=0; i<2; i++){
        for(int j=0; j<=2-i; j++){
            if(array[i]>array[i+1]){
            int temp= array[i];
            array[i]= array[i+1];
            array[i+1]= temp;
            }
        }  
    }

    for(int i=0; i<2; i++){
        if(array[i]+1!=array[i+1]){
            System.out.println(array[i]+1);
            break;
        }
    }
}
}
