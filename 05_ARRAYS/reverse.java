public class reverse {

    //print array function
    public static void print_arr(int arr[]){
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    // reverse fun
    public static void reverse_arr(int arr[])
    {
        int start =0, end = arr.length-1;
        while(start<end)
        {
            int tem = arr[end];
            arr[end]= arr[start];
            arr[start]=tem;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        
        int arr[]={44,12,88,56,1};
        System.out.println("Actually array-->");
        print_arr(arr);
        reverse_arr(arr);
        System.out.println("After performing reverse-->");
        print_arr(arr);

    }
    
}
