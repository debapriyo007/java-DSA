public class HeapSort {
    public static void Heapify(int i, int size, int arr[]){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIndx = i; //consider that my last index is my max index.

        if(left<size && arr[left]>arr[maxIndx]){
            maxIndx = left;
        }
        if(right<size && arr[right]>arr[maxIndx]){
            maxIndx = right;
        }
        if(maxIndx!=i){
            //swap
            int tem = arr[i];
            arr[i] = arr[maxIndx];
            arr[maxIndx] = tem;

            //recursively call for other node.
            Heapify(maxIndx, size, arr);
        }
    }

    public static void heapsort(int arr[]){

        //Step 1: T Build the Max Heap.
        int n = arr.length;
        for(int i = n/2-1; i>=0; i--){
            //Heapify.
            Heapify(i, n, arr);
        }

        //Step 2: Push largest at end.
        for(int i = n-1;i>0;i--){
            //swap.
            int tem = arr[0];
            arr[0] = arr[i];
            arr[i] = tem;

            //Heapify.
            Heapify(0, i, arr);
        }

    }
    public static void main(String[] args) {
        // If i want to short in accending order then -> Create Max Heap.

        //AIM : CONVERT ARRAY INTO MAXHEAP.

        //For non leaf node /(last Level) i called --> Hepify() //in this Fun write down maxHeap Logic.
        //Then it will convert into Max Heap.

        int arr[] = {1, 2, 4, 5,3};

        heapsort(arr);
        //print sorted array.
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
