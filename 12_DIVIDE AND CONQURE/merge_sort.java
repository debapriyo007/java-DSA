public class merge_sort {
    
    // printArr fun
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    
    // merge sort ...
    
    public static void mergeSort(int arr[], int si, int ei){
        //base case
        if(si>=ei){
            return ;
        }
        
        int mid = si+(ei-si)/2;
        
        // what i have to do
         mergeSort(arr, si, mid); // for left sub array..
         mergeSort(arr, mid+1, ei); //for righr sub array..
         merge(arr, si, mid , ei);
         
    }
    
    public static void merge(int arr[], int si, int mid , int ei){
        int tem[] =new int[ei-si+1];  //create a temporary arrayy..
        int i = si;// this iterater for the left sub array..
        int j = mid+1;  //this iterater for the right sub aray
        int k =0;  // this is for the tem array..
        
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                tem[k]= arr[i];
                i++;k++;
            }else{
                tem[k]= arr[j];
                j++;k++;
            }
        }
        
        //remaining element ...
        
        while(i<= mid){
            tem[k++]= arr[i++];
        }
        while(j<=ei){
            tem[k++]= arr[j++];
        }
        
        // copy the element in original...
        for(k=0, i=si;k<tem.length; k++, i++){
           arr[i] =tem[k];
        }
    }
    
    
    public static void main(String[] args) {
       int arr[] = {6,3,9,5,2,8};
       printArr(arr);
       mergeSort(arr, 0, arr.length-1);
        printArr(arr);
       
       
    }
}
 
