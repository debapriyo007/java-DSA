import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int n =sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum=sum+i;
          
        }
        System.out.println("The sum is:"+ sum);
        sc.close();
    }
    
}
