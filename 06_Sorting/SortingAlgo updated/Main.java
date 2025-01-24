package SortingAlgo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AllSortingAlgo allAlgo = new AllSortingAlgo();

        int[]arr = {3, 4, 5, 1, 77, 55};
        System.out.println("Org Array : " + Arrays.toString(arr));


//        allAlgo.bubbleSort(arr);
//        allAlgo.selectionSort(arr);
//        allAlgo.mergeSort(arr, 0, arr.length-1);
          allAlgo.quickSort(arr, 0, arr.length-1);


        System.out.println("After Sorting Array : " + Arrays.toString(arr));
    }
}
