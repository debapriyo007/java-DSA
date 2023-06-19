import java.util.*;
public class prb_03 {
    
    //push at bottom function..
    public static void pushAtBottom (Stack<Integer> s, int data){
       //base case..
       if(s.isEmpty()){
        s.push(data);
        return;
       }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
 
    //reverse the stack..
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int top = s.pop(); // remove top..
        reverse(s); //call next for removing..
        pushAtBottom(s, top); //when we came down we push the top at bottom..
    }

    //print stack function..
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        printStack(s);

    }
}
