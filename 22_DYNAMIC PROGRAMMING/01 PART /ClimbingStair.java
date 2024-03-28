public class ClimbingStair {

    public static int noOfWays(int n){
        if(n == 0)return 1;
        if(n<0)return 0;

        return noOfWays(n-1)+noOfWays(n-2);
    }

    public static int memoization(int dp[], int n){
        if(n == 0)return 1;
        if(n<0)return 0;

        if(dp[n]!= 0){
            //means array is full.
            return dp[n];
        }
        //otherwise fill the array.
        dp[n] = memoization(dp, n-1) + memoization(dp, n-2);
        return dp[n];
    }

    public static int Tabulation(int n){
        int []dp = new int[n+1];
        dp[0] = 1;
        for(int i = 1;i<=n;i++){
            if(i == 1){
                dp[i] = dp[i-1]+0;
            }else{
                dp[i] = dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int[]dp = new int[n+1];
        // System.out.println(noOfWays(n));
        System.out.println(memoization(dp, n));
        // System.out.println(Tabulation(n));
    }
}
