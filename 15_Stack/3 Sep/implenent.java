import java.util.*;

public class implenent {
    /*----------------------------implement stack using ArrayList-----------------------------------


    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        //is empty methord..
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push methord ..
        public static void push(int data){
            list.add(data);
        }

        //pop methord..
        public static int pop(){
            if(isEmpty()){
                System.out.println("The stack is emepty! You can't pop !!");
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("The stack is emepty! You can't see the peek !!");
            }
           return list.get(list.size()-1);
        }
    }*/


    /*---------------------Implement using LinkList ---> Important Implementation..---------------------------------- 
    //Node class..
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack {
          static Node head = null;

          public static boolean isEmpty(){
            return head == null;
        }

        //push..
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
            head = newNode;
                return;
            }
           
            newNode.next = head ;
            head = newNode;
        }

        //pop..
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //peek..
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        } 
    }*/    

    //-----------------------------Implementation using Array --------------------------------------

    public static class Stack{
        private int arr[] = new int[6];
        private int  index = 0;
        
        void push(int x){
            //base case.
            if(index == arr.length){
                System.out.println("Stack is full!!");
                return;
            }
           arr[index] = x;
           index++;
        }
        int peek(){
            if(index == 0){
                System.out.println("The Stack is Empty!!");
                return -1;
            }
            return arr[index-1];
        }

        int  pop(){
            if(index == 0){
                System.out.println("The Stack is Empty!!");
                return -1;
            } 
            int top = arr[index-1];
            arr[index-1] = 0;
            index--;
            return top; 
        }

        void display(){
            for(int i = 0 ;i<=index-1 ;i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }
        int size(){
            return index;
        }

        boolean isEmpty(){
            if(index == 0){
                return true;
            }else{
                return false;
            }
        }

        boolean isFull(){
            if(index == arr.length){
                return true;
            }
            return false;  
        }
        

    }
    public static void main(String[] args) {
        
        //Creating Object..
        Stack s1 = new Stack(); 
        //Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);

       s1.display();
    }
}
