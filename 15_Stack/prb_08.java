import java.util.*;
public class prb_08 {

    public static void maxArea(int arr[]){
        int maxArea = 0;
        //creating two array next smaller left, Right..
        int nsl[]= new int[arr.length]; //this is for left..
        int nsr[]= new int[arr.length];  //this is for right..
        //step 1: Find out next smaller Right..
        //creating a stack..
        Stack<Integer> s = new Stack<>();
        //backward loop..
        for(int i = arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]= arr.length;
            }else{
                nsr[i]= s.peek();
            }
            s.push(i);
        }

        //step 2: Find out next smaller Left..
        for(int i = 0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]= -1;
            }else{
                nsl[i]= s.peek();
            }
            s.push(i);
        }
        //step 3: Calculate area.. 
        //width = j-i-1
        for(int i =0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i]- nsl[i]-1;
            int currArea = height*width;
            maxArea = Math.max( currArea,maxArea);

        }
        System.out.println("Maximum area of Histrogram is : "+ maxArea);
    }
    public static void main(String[] args) {
        //int arr[]={2,1,5,6,2,3}; //this is the height of histrogram.
        //int arr[]={9,0}; //is't working ..
        int arr[]={6, 2, 5, 4, 5, 1, 6};
        maxArea(arr);

    }
}
