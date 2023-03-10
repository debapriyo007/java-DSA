public class prbl_6 {

    public static boolean isSorted(int arr[], int i){
        if(i== arr.length-1){
            return true;
        }
        if(arr[i]> arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(isSorted(arr, 0));

    }
    
}
