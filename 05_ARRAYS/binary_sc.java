public class binary_sc {

    public static int binary_search(int num[], int key) {
        int start = 0, end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                return mid;

            }

            if (num[mid] > key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int num[] = { 12, 2, 5, 66, 6, 7 };
        int key = 5;
        int index = binary_search(num, key);

        if (index == -1) {

            System.out.println("The key is not found");
        } else {

            System.out.println("The key is found at index:" + index);
        }

    }

}
