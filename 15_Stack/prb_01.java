import java.util.*;

public class prb_01 {
    public static void pushAtBottom(Stack<Integer> s, int data){
         if(s.isEmpty()){
            s.push(data);
            return;
         }

        //pop the elements..
        int top = s.pop(); //when poping at that time store the element in top.
        pushAtBottom(s, data);
        s.push(top); // add the element again ..
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
