public class prb_01 {

    //print fun of an array..
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void changeArr(int arr[], int i, int val){
        //base case
        if(i == arr.length){
            printArr(arr);  // call the print array function..
            return;
        }

        //recursion..
        arr[i]= val;
        changeArr(arr, i+1, val+1);//function call steps..
        arr[i]= arr[i]-2;  // backtracking..

    }

    public static void main(String[] args) {
        // crerating a 5 size array..
        int arr[]= new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);

    }
    
}
