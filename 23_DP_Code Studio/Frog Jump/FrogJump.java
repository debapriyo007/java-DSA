/**
 * FrogJump Question: 
 
There is a frog on the '1st' step of an 'N' stairs long staircase.
 The frog wants to reach the 'Nth' stair. 'HEIGHT[i]' is the height of the '(i+1)th' stair.
 If Frog jumps from 'ith' to 'jth' stair, the energy lost in the jump is given by
  absolute value of ( HEIGHT[i-1] - HEIGHT[j-1] ). 
  If the Frog is on 'ith' staircase, he can jump either to '(i+1)th' stair or to 
  '(i+2)th' stair. 
  Your task is to find the minimum total energy used by the frog to reach from '1st' stair to 'Nth' stair.

For Example:
If the given ‘HEIGHT’ array is [10,20,30,10], 
answer 20 as the frog can jump from 1st stair to 2nd stair (|20-10| = 10 energy lost) and then a jump from 2nd stair to last stair (|10-20| = 10 energy lost). So, the total energy lost is 20.
 */
public class FrogJump {

    public static void main(String[] args) {
        int[] height = {10, 20, 30, 10};
        int n = height.length;
        
        // int []dp = new int[n+1];
        // System.out.println(minEnergy(height,dp, n-1));

        System.out.println(Tabulation(height));
    }
    //Tabulation Methord.
    public static int Tabulation(int arr[]){
        int n = arr.length;
        int[]dp = new int[n+1];
        dp[0] = 0;
        for(int i = 1;i<n;i++){
            int left = dp[i-1] + Math.abs(arr[i] - arr[i-1]); 
            int right = Integer.MAX_VALUE;
            if(i>1) right = dp[i-2] + Math.abs(arr[i] - arr[i-2]); 

            dp[i] = Math.min(left, right);
        }
        return dp[n-1];
    }
    //Using Recursion +  Memoization
    public static int minEnergy(int[]arr,int[]dp,  int index){
        if(index == 0)return 0;

        if(dp[index]!= 0)return dp[index]; //menas my dp array full.

        int left = minEnergy(arr,dp, index-1) + Math.abs(arr[index] - arr[index-1]);
        int right = Integer.MAX_VALUE;
        if(index>1)right = minEnergy(arr,dp, index-2) + Math.abs(arr[index] - arr[index-2]);

        return dp[index] =  Math.min(left, right);
    }
    
    
}