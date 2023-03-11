public class prbl_3 {

    public static int rotated(int arr[], int si, int ei, int target) {

        
        

        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case a : left

            if (arr[si] <= target && target <= arr[mid]) {
                return rotated(arr, si, mid - 1, target);
            } else {
                return rotated(arr, mid + 1, ei, target);
            }
        } 
        else {

            // mid on L2..
            if (arr[mid] <= target && target <= arr[ei]) {
                return rotated(arr, mid + 1, ei, target);
            } else {
                rotated(arr, si, mid - 1, target);
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int index = rotated(arr, 0, arr.length - 1, target);
        System.out.println(index);

    }

}
