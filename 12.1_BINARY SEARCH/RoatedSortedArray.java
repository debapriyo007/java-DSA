public class RoatedSortedArray {

    public static int serach(int arr[], int target){
        int si = 0;
        int ei = arr.length-1;
        

        while(si<=ei){
            int mid = si+(ei-si)/2;
            if(arr[mid] ==  target){
                return mid;
            }else if(arr[mid] < arr[ei]){
                //mid to end is sorted.
                //check my targert is lie in this range or not.
                if(target>arr[mid] && target<= arr[ei]){
                    si = mid+1;
                }else{
                    ei = mid-1;
                }
            }else{ //if start to mid is sorted.
                if(target >= arr[si] && target< arr[mid]){
                      ei = mid-1;
                }else{
                    si = mid+1;
                }
            }
        }return -1;
    }
    public static void main(String[] args) {
        int arr[]= {3,4,5,1,2,};
        int target = 2;
        System.out.println("The target "+ target+ " is found at index : " +serach(arr, target));
    }
}
