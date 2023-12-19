

public class Fibo {

    /*Memoization From to calculate Fibonacci..

    public static int Fibonacci(int n, int dp[]){
        if(n == 1 || n == 0){
            return n;
        }
        if(dp[n]!=0){
            //means already calculated.
            return dp[n];
        }
        dp[n] =  Fibonacci(n-1, dp) + Fibonacci(n-2, dp); //calculated here.
        return dp[n];
    }*/


    public static int TabulationFrom(int n){
        //create a Table .
        int dp[] = new int[n+1];
        //Initilization.
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n]; //ans
    }

    public static void main(String[] args) {
        int n = 6;
       /*  int dp[] = new int[n+1];  //--> This lines for "Memoization"
        System.out.println(Fibonacci(n, dp));*/

        System.out.println(TabulationFrom(n));
    }
}
