import java.util.*;

public class stack_using_LL {
    // creating a node..
    static class Node {
        int data;
        Node next;

        // creating a constructure..
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class stack {
        static Node head = null;
 
        //if there is no node exists means only one node which is head..
        public static boolean isEmpty() {
            return head == null;
        }

        //push fun ..
        public static void push(int data){
            //in linklist push means replace the head..
            Node newNode = new Node(data); //creating new node..
            if(isEmpty()){
              head = newNode;
              return;
            }
            newNode.next = head;
            head = newNode; 
        }

        //pop function ..
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top; 
        }

        //peek fun..
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data; 
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
