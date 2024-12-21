import java.util.ArrayList;
import java.util.Arrays;

public class AllSortingAlgo {
    public static void main(String[] args) {

        int[]arr = {
            33, 3, 2, 1, 89, 90, 7
        };

        SortingAlgorithm algo = new SortingAlgorithm();

        System.out.println("ORG ARRAY : " + Arrays.toString(arr));
        // algo.bubbleSort(arr);
        // algo.selectionSort(arr);
        // algo.insertionSort(arr);
        // algo.mergeSort(arr, 0, arr.length-1);
        System.out.println("AFTER SORTING : " + Arrays.toString(arr));

    }
}

class SortingAlgorithm{
    void bubbleSort(int[]arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            boolean isSwap = false;
            for(int j = 0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                    isSwap = true;
                }
            }

            if(!isSwap){break;}
        }
    }

    //selection sort approach will be -> 'Take smaller element and put it into first.'
    void selectionSort(int[]arr){
        int n = arr.length;
        for(int i = 0 ;i<n-1;i++){
            int minPos = i;
            for(int j = i+1;j<n;j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }

            int tem = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = tem;
        }
    }

    void insertionSort(int[]arr){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;    
        }
    }

    void mergeSort(int[]arr, int si, int ei){

        if(si>= ei){
            return;
        }

        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);

    }

    void merge(int[]arr, int si, int mid, int ei){
        
        ArrayList<Integer> list = new ArrayList<>();

        //take pointers.
        int index1 = si;
        int index2 = mid+1;

    
        while(index1 <= mid && index2 <= ei){
            if(arr[index1] < arr[index2]){
                list.add(arr[index1]);
                index1++;
            }else{
                list.add(arr[index2]);
                index2++;
            }
        }

        //for the rest elements.
        while(index1<=mid) {
            list.add(arr[index1]);
            index1++;
        }
        while(index2<=ei) {
            list.add(arr[index2]);
            index2++;
        }

        int k = si;
        for(int i = 0;i<list.size();i++){
            arr[k++] = list.get(i);
        }
    }

    //Quick Sort is Left..
}
