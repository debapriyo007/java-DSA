import java.util.*;

public class continueprb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the number:");
            int n = sc.nextInt();
            sc.close(); //some thing is wrong
            if(n %10==0) 
            {
                continue;
            }
            System.out.println("The num is:"+ n);
        }while(true);
    }
    
}
