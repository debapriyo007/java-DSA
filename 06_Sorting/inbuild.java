
import java.util.*;
public class inbuild {

    //print_arr
    public static void print_arr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int arr[]={14,2,5,68,54,1};
        Arrays.sort(arr); //this a inbuild fun time complexity is 0(nlog n).


        // Arrays.sort(arr,0,3);  <------ suppose you sort the 3 index of the array..
        print_arr(arr);
        

    }
    
}
