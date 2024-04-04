public class POW {
    public static void main(String[] args) {
        double x = 2;
        int n = 5;

        System.out.println(powerExponential(x, n));
    }

    public static double powerExponential(double x, int n){
        
        //if n is neg.
        double ans = 1;
        long m = n;
        if(m<0){
            m = (-1)*m;
        }
        while (m!=0){
            if(m%2 == 0){
                x = x*x;
                m = m/2;
            }else{
                ans = ans*x;
                m = m-1;
            }   
        }
        if(n<0){
            return 1/ans;
        }else{
            return ans;
        }
    }
}
