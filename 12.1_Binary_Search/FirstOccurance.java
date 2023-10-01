public class FirstOccurance {

    /* Calculate the firstOccurance index.. */

    /*
     * public static int firstOcc(int arr[], int target){
     * int si = 0;
     * int ei = arr.length-1;
     * int fo = -1;
     * while(si<=ei){
     * int mid = si+(ei-si)/2;
     * if(arr[mid] == target){
     * fo = mid;
     * ei = mid-1;
     * }else if(arr[mid]<target){
     * si = mid+1;
     * }else{
     * ei = mid-1;
     * }
     * }return fo;
     * }
     */

    /* Calculate the firstOccurance index.. */
    public static int lastOcc(int arr[], int target) {
        int si = 0;
        int ei = arr.length - 1;
        int lo = -1;
        while (si <= ei){
            int mid = si + (ei - si) / 2;
            if(arr[mid] == target){
                lo = mid;
                si = mid + 1;
            }else if(arr[mid] < target){
                si = mid + 1;
            }else{
                ei = mid - 1;}
        }return lo;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 41, 33, 33, 33, 33, 33, 45, 56, 65, 67, 69, 99, 900 };
        int target = 33;
        // System.out.println(firstOcc(arr, target));
        System.out.println(lastOcc(arr, target));

    }
}
