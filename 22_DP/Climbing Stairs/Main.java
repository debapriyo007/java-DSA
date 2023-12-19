

public class Main {
    /*Approach "Memoization --> 0(N) " 
    public static int ClimbingStair(int n, int dp[]){
        //base case .
        if(n == 0)return 1;
        if(n<0) return 0;
        
        if(dp[n]!=-1){
            //means array is already filled.
            return dp[n];
        }
        dp[n] = ClimbingStair(n-1, dp) + ClimbingStair(n-2, dp);
        return dp[n];
    }*/

    public static int ClimbTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i = 1;i<=n;i++){
            if(i ==1){
                dp[i] = dp[i-1];
            }else{
                dp[i] = dp[i-1]+dp[i-2];
            }
        }return dp[n];
    }


    public static void main(String[] args) {
        int n = 5;
        // 5 ->  4(5 Ways) + 3 (3 ways) = 8 ways.(for 5 there are 8 ways.)

        /*int dp[] = new int[n+1];
        Arrays.fill(dp, -1);

        System.out.println(ClimbingStair(n, dp));*/


        System.out.println(ClimbTab(n));
    }
}
