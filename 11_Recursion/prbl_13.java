public class prbl_13 {

    public static int frndPair(int n){
        //Base Case...
        if(n==1||n==2){
            return n;
        }
        
        // choice...
        //single..
        int nm1= frndPair(n-1);

        //pair...
        int nm2 = frndPair(n-2);
        int  nopairfWays = (n-1)*nm2;

        return nm1+nopairfWays;


       // return frndPair(n-1)+(n-1)*frndPair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(frndPair(3));
        
    }
    
}
