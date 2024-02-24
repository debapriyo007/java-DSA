//Merge sort..

public class prbl_1 {
     //printArr Function...

     public static void printArr(int arr[], int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

     }


     public static void mergeSort(int arr[], int si, int ei){
        //base case
        if(si>= ei){
            return ;
        }

        //what have to do..
         int mid = si+(ei-si)/2;  //find out the mid..
         mergeSort(arr, si, mid);  //for left sub array..
         mergeSort(arr, mid+1, ei); // for rigt sub array..
         merge(arr, si, mid, ei);

    }
    
    //to merge both sub array..
    public static void merge(int arr[], int si, int mid , int ei){
        int tem[]= new int [ei-si+1];
        int i =si; //pointer for left subarray..
        int j = mid+1; // pointer for right subarray..
        int k =0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
            tem[k]= arr[i];
                i++;k++;
            }else{
                tem[k]= arr[j];
                j++;k++;
            }
        }

        // for the remaining element ...

        while(i<=mid){  // left subarray..
            tem[k++]= arr[i++];
        }

        while(j<=ei){
            tem[k++]= arr[j++];
        }

        //copy ele tem  to original array..
        for(k =0,i=si;k<tem.length;k++, i++){
            arr[i]= tem[k];
        }
    }



    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int size = arr.length;
        printArr(arr, size);
        mergeSort(arr, 0, size-1);
        printArr(arr, size);

    }
    
}
