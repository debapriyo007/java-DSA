public class bubble {

    // print function
    public static void print_arr(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
   // bubble sort
    public static void bubble_sort(int arr[], int size)
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //swap fun
                    int tem =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = { 44, 5, 2, 1, 66, 99, 3 };
        int size = arr.length;
        System.out.println("The array is:--->");
        print_arr(arr, size);
        bubble_sort(arr, size);
        System.out.println("Performing bubble sort the array is:--->");
        print_arr(arr, size);
        
    }


}
