import java.util.Scanner;

public class print_n_num {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n number:");
        int n= sc.nextInt();
        int cout=1;
        while(cout<=n)
        {
            System.out.print(cout+ " ");
            cout++;
        }
        sc.close();
    }
    
}
