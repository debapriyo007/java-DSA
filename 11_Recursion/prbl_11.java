public class prbl_11 {

    //Tiling problem.
    public static int tiling(int n){  //where, n is len of the floor.
            //base case
            if(n==0 ||n==1){
                return 1;
            }
        // for vertically ..
        int nm1 = tiling(n-1);

        // for horizontally..

        int nm2 = tiling(n-2);

        return nm1+nm2;

    }


    public static void main(String[] args) {
        System.out.println("The ways are: "+tiling(3));
    }
    
}
