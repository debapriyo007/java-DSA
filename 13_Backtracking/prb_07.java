public class prb_07 {

    public static int gridWays(int i, int j, int m, int n){

        //base case ...
        if(i ==n-1 && j ==m-1){
            return 1;  // if the source is already in target then the way is 1..
        }else if(i==n || j ==m){  // boundary cross condition..
            return 0;
        }

        
        int w1 = gridWays(i, j+1, m, n); // first way1 if the source move right side..
        int w2 = gridWays(i+1, j, m, n); // first way2 if the source move down side..
        return w1+w2;  //total ways...
    }



    public static void main(String[] args) {
        
        int m=3, n=3;
      System.out.println("The ways for M X N grid is:"+gridWays(0, 0, m, n));  // the souce is in the cell (0,0);
    }
    
}
