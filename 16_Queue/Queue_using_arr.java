import java.util.*;

public class Queue_using_arr {

    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        //isEmpty fun..
        public static boolean isEmpty(){
            return rear == -1;
        }

        //add function..
        public static void add(int data){
            if(rear == size-1){
                System.out.println("The queue is full");
                return;
            }
            rear = rear+1;
            arr[rear]= data;
        }

        //remove function..
        public static int remove(){ //Take 0(n)
            if(isEmpty()){
                System.out.println("The Queue is Empty!");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]= arr[i+1];
            }
            rear = rear-1;
            return front;
        }

        //peek function..
        public static int peek(){
            if(isEmpty()){
                System.out.println("The Queue is Empty!");
                return -1;
            }
            return arr[0]; 
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
         q.add(1);
         q.add(2);
         q.add(3);

         while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
         }
    }
}
