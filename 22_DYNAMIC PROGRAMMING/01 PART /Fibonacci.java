/**
 * Fibonacci
 */
public class Fibonacci {

    static int nthFiboMemo(int n , int[]dp){
        if(n ==0 || n ==1){
            return n;
        }
        if(dp[n]!= 0){ //menas my dp[] is totally filled
            //i'm just return my dp[] array
            return dp[n];
        }
        dp[n] =  nthFiboMemo(n-1 ,dp)+nthFiboMemo(n-2, dp);
        return dp[n];
    }

    static int nthFibTab(int n){
        int[]dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        // int []dp = new int[n+1];
        // System.out.println(nthFiboMemo(n, dp));
        System.out.println(nthFibTab(n));
    }
}