
import java.util.*;

public class bionmial {
           //factorial fun....
    public static int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }

    //binomial cofficent

    public static int bion(int n, int r)
    {
        int x= factorial(n);
        int y=factorial(r);
        int z= factorial(n-r);

        int bio= x/(y*z);

        return bio;


    }




    public static void main(String[] args) {
     int bio= bion(5, 2);  
     System.out.println("The bionomial cofficent is:"+ bio);  

    }
    
}
