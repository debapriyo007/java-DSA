public class linklist4 {
    // create node...
    public static class Node {
        int data;
        Node next;

        // create constructor...
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    // In linkList one HEAD and one TAIL is exist
    // so we can define then inside the class as a poperty..

    public static Node head;
    public static Node tail;

   
    //linklist cycle exits or not..
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next!= null){
            slow = slow.next;  //+1
            fast = fast.next.next;//+2
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    //Remove cycle...
    public static void removeCycle(){

        //step 1: detect the cycle is exists or not..
        Node slow = head;
        Node fast = head;
        boolean iscycle = false;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next;
            if(slow == fast){
                iscycle = true;
                break;
            }
        }
        if(iscycle == false){
            return;
        }

        //finding the two pointer meeting same node..
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            prev = prev.next;
        }
        //last node next should be pointing null..
        prev.next = null;
    }

    public static void main(String[] args) {

        head = new Node(1);
        //head.next = new Node(2);
        Node tem = new Node(2);
        head.next = tem;
        head.next.next = new Node(3);
        head.next.next.next = tem;
        //head.next.next.next = new Node(4);

        //1->2->3->1 
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
        
        
       
    }

}
