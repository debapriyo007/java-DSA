public class FindMinimumRoated {

    public static int findMin(int arr[]){
        int si = 0;
        int ei = arr.length-1;
        int ans = -1;
        while(si<=ei){
            int mid = si+(ei-si)/2;
            if(arr[mid]<arr[arr.length-1]){
                ans = mid;
                ei = mid-1;
            }else{
                si = mid+1;
            }
        }return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,1,2,};
        System.err.println(findMin(arr));

    }
}
