public class binary {

    // print array fun...
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    // binary search...
    public static int binarySearch(int arr[], int key) {

        int si=0; 
        int ei =arr.length-1;
        while (si <=ei) {
            int mid = (si+ei)/2;
            if (arr[mid] == key) {
                return mid;
            }
              if (arr[mid] < key) {
                si = mid + 1;
            }
            else{
                ei= mid-1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {12,58,88,99,121,880 };
        int key = 99;
        int index = binarySearch(arr, key);

        if(index==-1){
            System.out.println("The key is not found!!");
        }else{
            System.out.println("The key is found "+ index);
        }

    }

}
