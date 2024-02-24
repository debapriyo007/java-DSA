import java.util.*;



public class else_if {
    public static void main(String args[]){
        System.out.println("Enter the your age:");
        Scanner sc =new Scanner(System.in);
        int age =sc.nextInt();

         if(age>=50 && age<100)
        {
            System.out.println("Old");
        }
         else if(age>=18)
        {
            System.out.println("Adult");
        }
        else if(age>=12 && age<18)
        {
            System.out.println("Teen_age");

        }
       else
        {
            System.out.println("Kid");
        }
        sc.close();
    }
    
}
