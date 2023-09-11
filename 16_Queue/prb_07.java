import java.util.*;
//Implement Stack using deque.

public class prb_07 {
    static class Stack{
         //Creatingg a deque.
         Deque<Integer> d = new LinkedList<>();

         //Now creating stack methords..
         public void push(int x){
            d.addLast(x);
        }
        public int pop(){
            return d.removeLast();
        }
        public int peek(){
            return d.getLast();
        }
    }

    static class Queue{
         //Creatingg a deque.
         Deque<Integer> d = new LinkedList<>();

         public void add(int x){
            d.addLast(x);
        }
        public int remove(){
            return d.removeFirst();
        }

        public int peek(){
            return d.getFirst();
        }
    }
    public static void main(String[] args) {
        
        /*creating object of Stack..
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("Peek =  " + s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());*/

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Peek = "+ q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
