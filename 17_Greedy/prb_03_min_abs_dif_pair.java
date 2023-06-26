import java.util.*;

public class prb_03_min_abs_dif_pair {
    public static void main(String[] args) {
        int a[]={1,7,5};
        int b[]= {2,3,5};
        
        //sort the both two array..
        Arrays.sort(a);
        Arrays.sort(b);
        int mindiff = 0;
        for(int i = 0 ;i<a.length;i++){
            mindiff = mindiff+Math.abs(a[i]-b[i]);
        }
        System.out.println("The minimum diff :"+ mindiff);
    }

}
