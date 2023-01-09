public class print {
   
    //print fun

    public static void print_arr(int arr[], int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[]={41,2,56,54,85,2};
        int size= arr.length;
        System.out.println("The array is:--->");
        print_arr(arr, size);
    }
    
}
