public class sub_arr {

    public static void Sub_arr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
              for(int k=i;k<=j;k++)
              {
                System.out.print(arr[k] + " ");
              }
              System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int arr[]={54,12,3,31};
        Sub_arr(arr);
    }
    
}
