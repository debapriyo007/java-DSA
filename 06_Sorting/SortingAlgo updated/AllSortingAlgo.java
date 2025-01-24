package SortingAlgo;
import Arrays.Hepler.HelperMethod;
import SortingAlgo.Utils.Utils;

import java.util.ArrayList;

class AllSortingAlgo {
    public void bubbleSort(int[]arr){
        for(int i = 0;i<arr.length-1;i++){
            boolean isSwap = false;
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                        HelperMethod.swap(arr, j, j+1);
                        isSwap = true;
                }
            }

            if(!isSwap){break;}
        }
    }

    //Selection-Sort Algo.
    // 1) Pick the smallest and put it into the beginning.
    public void selectionSort(int[]arr){
       for(int i = 0;i<arr.length-1;i++){
           int minPos = i;
           for(int j = i+1 ;j<arr.length; j++){
               if(arr[minPos] > arr[j]){
                   minPos = j;
               }
           }
           //swap
           HelperMethod.swap(arr, minPos, i);
       }
    }

    //Pick an element from Un-Sorted Part and place it in the right position.
    public void insertionSort(int[]arr){
       for(int i = 1;i<arr.length-1;i++){
           int currEl = i;
           int prev = i-1;
           //finding out the current pos to insert.
           while(prev>= 0 && arr[prev] > arr[currEl]){
               arr[prev+1] = arr[prev];
               prev--;
           }
           //insertion.
           arr[prev+1] = arr[currEl];
       }
    }


    //merge sort - Recursion + Two Pointer.
    public void mergeSort(int[]arr, int si, int ei){

        if(si >= ei){return;}

        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid); //merge for the left part
        mergeSort(arr, mid+1, ei); //merge for the right part
        Utils.merge(arr, si, mid, ei);
    }

    //Quick Sort.

    public void quickSort(int[]arr, int si, int ei){

        if(si >= ei){return;}

        int pivotIndex = Utils.partition(arr, si, ei);
        quickSort(arr, si, pivotIndex-1); //left array.
        quickSort(arr, pivotIndex+1, ei); //right array
    }
}
