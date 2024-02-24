public class Sqrt {

    public static int sqrtofX(int x){
        int si = 0;
        int ei = x;
        int ans = 0;
        while(si<=ei){
            int mid = (si+ei)/2;
            int val = mid*mid;
            if(val == x){
                return mid;
            }else if(val < x){
                ans = mid;
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }return ans;
    }
    public static void main(String[] args) {
        int x = 25;
        System.out.println( "Sqrt of "+ x +" is : "+sqrtofX(x));

    }
}
