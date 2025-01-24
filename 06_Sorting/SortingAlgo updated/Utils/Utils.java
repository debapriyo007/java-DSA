package SortingAlgo.Utils;
import Arrays.Hepler.HelperMethod;

import java.util.ArrayList;

public class Utils {

    public static void merge(int[] arr, int si, int mid, int ei){

        ArrayList<Integer> list = new ArrayList<>();
        //take two pointer.
        int left = si;
        int right = mid+1;

        while(left <= mid && right <= ei){
            if(arr[left] < arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                right++;
            }
        }

        //check for those ele which are left.
        while(left <= mid){
            list.add(arr[left]);
            left++;
        }

        while(right <= ei){
            list.add(arr[right]);
            right++;
        }

        int k = si;
        for(int i = 0;i<list.size();i++){
            arr[k++] = list.get(i);
        }
    }

    public static  int partition(int[]arr, int si, int ei){

        int preIndex = si-1;
        int pivotEle = arr[ei];

        for(int j = si;j<ei;j++){
            if(arr[j] <= pivotEle){
                preIndex++;
                //swap with j, prevIndex ele..
                HelperMethod.swap(arr, j, preIndex);
            }
        }
        preIndex++;
        HelperMethod.swap(arr, ei, preIndex);

        return preIndex; //this previous index is my pivot element index.
    }












    //If needed, then use it! i'm using my own package. "HelperMethod"
    //    public  static  void swap(int[]arr, int si, int ei){
    //        int tem = arr[si];
    //        arr[si] = arr[ei];
    //        arr[ei] = tem;
    //    }

}
