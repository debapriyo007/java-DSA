public class selection {

    //print_arry fun

    public static void print_arr(int arr[], int  size)
    {
      for(int i=0;i<size;i++)
      {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
   

    //swap fun
    public static void swap(int arr[],int x,int y)
    {
        int tem =arr[x];
        arr[x]=arr[y];
        arr[y]=tem;
    }

    // selection sort

    public static void selection_sort(int arr[], int size)
    {
        for(int i=0;i<size-1;i++)
        {
            int min=i;
            for(int j=i+1;j<size;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
         swap(arr, i, min);
            
        }
    }




    public static void main(String[] args) {
        int arr[]={44,22,33,6,3,4};
        int size= arr.length;
        print_arr(arr, size);
        selection_sort(arr, size);
        System.out.println("After performing the selction sort");
        print_arr(arr, size);

        
    }
    
}
