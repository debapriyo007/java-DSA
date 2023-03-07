import java.util.Scanner;

public class prbl_1 {
    public static void decreOrder(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        decreOrder(n-1);
    }
    public static void main(String[] args) {
        //int n=10;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decreOrder(n);
        sc.close();
        
    }
    
}


