public class pair_in_arr {

    public static void pair_arr(int arr[]) {
        // you count how many pair
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
                count++;
            }
            System.out.println();
        }
        System.out.println("The total pair is:" + count);
    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 8, 10 };
        pair_arr(arr);

    }

}
