
public class insertion {

    public static void insertion_sort(int arr[], int size)
    {
        for(int i=0;i<size;i++)
        {
            int x=arr[i];
            int j=i-1;
            while(j> -1 && arr[j]>x)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=x;
        }
    }

    public static void print_arr(int arr[], int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={44,12,56,63,7,8};
        int size =arr.length;
        insertion_sort(arr, size);
        print_arr(arr, size);

    }
    
}
