public class prbl_5 {

    public static int fibonacci(int n){
        // if(n==0){
        //     return 0;
        // }if(n==1){
        //     return 1;
        // }

        if(n==0 || n==1){   // This is our Base-Cases
            return n;
        }
        int fst_prv= fibonacci(n-1);
        int snd_prv =fibonacci(n-2);
        int fib = fst_prv+snd_prv;
        return fib;

    }
    public static void main(String[] args) {
        System.out.println("The fibonacci number is :"+ fibonacci(40));
        
    }
    
}
