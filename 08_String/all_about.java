import java.util.Scanner;

public class all_about {
    public static void main(String[] args) {

        // The way we creatre strings-->

        // char arr[]={'a','b','c','d'};
        // String str="abcd";
        // String str2= new String("xyz@1234");

        //Take string input from user-->
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Your name is:");
        System.out.println(name);
        sc.close();

    }
}
