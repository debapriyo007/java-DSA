import java.util.*;
public class prb_05 {
    public static void main(String[] args) {
        int arr[]= {6,8,0,1,3};
        //creating a stack..
        
        Stack<Integer> s = new Stack<>();
        //create a new array to store the result of next greater..
        int nextGreater[]= new int[arr.length]; //it size should be equal to array size.

        for(int i = arr.length-1; i>= 0;i--){ // backward traversal to the array..
            while(!s.isEmpty() && arr[s.peek()]<= arr[i]){ //when ever my arr elem is't greater or equal to my stack top i kepp remove the element from stack
                s.pop();
            }
            if(s.isEmpty()){ // when my stack is empty .NextGreater is -1.
                nextGreater[i]= -1; 
            }else{
                nextGreater[i]= arr[s.peek()]; //stack is not empty nextGraeter is stack top most element
            }
            s.push(i); //add the ele of array into stack..
        }

        for(int i = 0 ;i<nextGreater.length;i++){ // print the result array which is nextgreater array..
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }
}
