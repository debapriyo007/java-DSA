public class Sqrt {
    public static void main(String[] args) {
        int n = 169;
        System.out.println(findSqrtOptimal(n));
    }

    // unsing brute froce.
    static int findSqrt(int n){
        int ans = 0;
        for(int i = 1;i<=n;i++){
            if(i*i<= n){
                ans = i;
            }else{
                break;
            }
        }
        return ans;
    }

    static int findSqrtOptimal(int n){
        int low = 1;
        int high = n;
        while (low<= high) {
            int mid = low+(high-low)/2;
            int val = mid*mid;
            if(val == n){
                return mid;
            }else if(val>n){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}
