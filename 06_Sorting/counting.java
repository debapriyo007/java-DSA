


public class counting {

    // print_arr
    public static void print_arr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    // counting sort

    public static void counting_sort(int arr[]) {
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest=Math.max(largest,arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        

    }

    public static void main(String[] args) {

        int arr[] = { 88, 2, 6, 35, 35, 62, 1 };
        print_arr(arr);
        counting_sort(arr);
        print_arr(arr);
    }

}
