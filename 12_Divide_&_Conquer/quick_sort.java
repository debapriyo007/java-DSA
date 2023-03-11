public class quick_sort {

    //printArr...
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    //perform quick sort..

    public static void quickSort(int arr[], int si, int ei){
            //Base Case..
            if(si>=ei){
                return;
            }

        int pIndx = partation(arr, si, ei);
        quickSort(arr, si, pIndx-1);  //left part
        quickSort(arr, pIndx+1 , ei);  // right part..
    }

    public static int partation(int arr[], int si, int ei){
       int pivot = arr[ei];
       int  i =si-1;

       for(int j = si;j<ei;j++){
        if(arr[j]<=pivot){
            i++;
            //swap..
            int tem = arr[j];
            arr[j]= arr[i];
            arr[i]= tem;
        }
       }
       i++;
       int tem =pivot;
       arr[ei]= arr[i];
       arr[i]= tem;
       return i;
    }



    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        printArr(arr);
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
        
        
    }
    
}
