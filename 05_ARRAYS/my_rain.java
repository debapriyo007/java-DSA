public class my_rain {

    public static int trappedrain(int height[], int n) {
        int trappedwater = 0;
        for (int i = 0; i < n - 1; i++) {

            //left max
            int left = height[i];
            for (int j = 0; j < i; j++) 
            {
                left = Math.max(left, height[j]);
            }

            //right max

            int right=height[i];
            for(int j=i+1;j<n;j++)
            {
                right = Math.max(right, height[j]); 
            }

            trappedwater+=Math.min(left,right)-height[i];

        }
        return trappedwater;
    }

    public static void main(String[] args) {

        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int n = height.length;
        System.out.println(trappedrain(height, n));
    }

}
