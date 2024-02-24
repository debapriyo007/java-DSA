public class BinarySearch {

    // public static boolean bSearch(int arr[], int target){
    //     int si = 0;
    //     int ei = arr.length -1;
    //     while(si<=ei){
    //         int mid = (si+ei)/2;
    //         if(arr[mid] == target)return true;
    //         else if(arr[mid] < target)si = mid+1;
    //         else ei = mid-1;
    //     }return false;
    // }

    public static int recursiveB(int arr[], int si, int ei, int target){
        while(si<=ei){
            int mid = (si+ei)/2;              // Time Complexity --> 0(log n)
            if(arr[mid] == target)return mid; // Space Complexity --> 0(log n)
            else if(arr[mid] < target) return recursiveB(arr, mid+1, ei, target);
            else return recursiveB(arr, si, mid-1, target);
        }return -1;
    }
    public static void main(String[] args) {
        int arr[] = {12,31,33,45,67,78,99,999};
        int target = 45;
        //System.out.println(Bsearch(arr, target));
        System.out.println("Found at index -> "+recursiveB(arr, 0, arr.length-1, target));
    }
}
