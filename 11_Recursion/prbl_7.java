public class prbl_7 {

    public static int firstOccur(int arr[], int key, int i){
        if(i== arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccur(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        // int key=5  ;
        // int index = firstOccur(arr, key, 0);
        System.out.println(firstOccur(arr, 5, 0));
        // if (index==-1){
        //     System.out.println("The key is not found!!");
        // }else{
        //     System.out.println("The key is found at index "+ index);
        // }
        
    }
    
}
