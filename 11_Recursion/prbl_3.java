public class prbl_3 {

    //factorial fun...

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int f= factorial(n-1);
        int fn= n*f;
        return fn;
    }


    public static void main(String[] args) {
        //prbl_3 n = new prbl_3(); 
                 //if i did't create my function static.
                // first i have to create my class obj and then use.
        System.out.println("The factorial is :"+ factorial(5) );
        
    }
    
}
