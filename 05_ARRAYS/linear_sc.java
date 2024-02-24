public class linear_sc {
    public static int linear_search(int arr[], int size,int elem)
    {
        for(int i=0;i<size;i++)
        {
            if(arr[i]==elem)

            {
               return i;
                
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,5,1};
        int size= arr.length;
        int elem=1;

        int index=linear_search(arr, size, elem);
        if(index==-1)
        {
            System.out.println("Element not found!");
        }
        else{

            System.out.println("Element found at index:" + index);
        }
        
        
    }
    
}
