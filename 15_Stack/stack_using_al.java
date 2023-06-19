import java.util.*;

public class stack_using_al {
    static class stack{
        //crete new array list..
        static ArrayList<Integer> list = new ArrayList<>();
        //creating isempty fun..
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        //push function..
        public static void push(int data){
            list.add(data);
        }
        //pop function ..
        public static int pop(){
            //corner case..
             if(isEmpty()){
                System.out.println("The stack is Empty");
             }
            // cal the top..
            int top = list.get(list.size()-1);  //get is taken 0(1) tc.
            list.remove(list.size()-1); //remove fun is also taken 0(1) tc..
            return top;
        }

        //peek function..
        public static int peek(){
             //corner case..
             if(isEmpty()){
                System.out.println("The stack is Empty");
             }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
