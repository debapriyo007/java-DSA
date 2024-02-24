import java.util.Scanner;

public class adult_or_not {
    public static void  main(String args[]){
        Scanner sc =new Scanner(System.in);
       
        System.out.println("Enter your age:" );
        int age =sc.nextInt();
        if(age>=18)
        {
            System.out.println("You are Adult");

        }
        else if (age>13 && age<18)
        {
            System.out.println("You are Teenager");
        }
        else{
            System.out.println("Your age is below 18");
        }
        sc.close();
    }
    
}
